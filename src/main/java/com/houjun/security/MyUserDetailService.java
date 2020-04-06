package com.houjun.security;

import com.houjun.domain.Permission;
import com.houjun.domain.User;
import com.houjun.mapper.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDetailsService是用来获取UserDetail实例即用户信息
 * 自定义用户信息获取器
 */
public class MyUserDetailService implements UserDetailsService {
    private Logger logger = Logger.getLogger(MyUserDetailService.class);
    @Autowired
    private UserMapper userMapper;

    /**
     * 重写loadUserByUsername，来获取用户信息【UserDetail的对象】
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.findByUsername(username);//查用户信息
        if (user == null) {
            throw new UsernameNotFoundException("用户没有发现");
        }
        List<Permission> permissionList = userMapper.findPermissionByUsername(username);//查权限
        ArrayList<GrantedAuthority> grantedAuthoritys = new ArrayList<GrantedAuthority>();
        for (Permission permission : permissionList) {
            SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(permission.getPermTag());
            grantedAuthoritys.add(simpleGrantedAuthority);
        }
        user.setAuthorities(grantedAuthoritys);

        logger.info("当前用户" + user);
        return user;
    }
}
