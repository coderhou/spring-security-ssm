package com.houjun.mapper;

import com.houjun.domain.Permission;
import com.houjun.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        User eaic = userMapper.findByUsername("jack");
        System.out.println(eaic);
        List<Permission> permission = userMapper.findPermissionByUsername("eric");
        System.out.println(permission);

    }

    @Test
    public void updatePassword() {
        User eaic = userMapper.findByUsername("jack");
        PasswordEncoder pe = new BCryptPasswordEncoder();
        String encode = pe.encode("123456");

        eaic.setPassword(encode);
        System.out.println( userMapper.update(eaic));
    }


}
