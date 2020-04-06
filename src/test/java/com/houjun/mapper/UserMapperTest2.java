package com.houjun.mapper;

import com.houjun.domain.Permission;
import com.houjun.domain.User;
import com.houjun.security.MyUserDetailService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.apache.ibatis.io.Resources.*;

public class UserMapperTest2 {
    private static org.apache.log4j.Logger logger = Logger.getLogger(UserMapperTest2.class);
    public static void main(String[] args) throws IOException {
        InputStream in = getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();

        UserMapper um = session.getMapper(UserMapper.class);
        User jack = um.findByUsername("jack");
        List<Permission> permissionList = um.findPermissionByUsername("jack");
        System.out.println(permissionList);
        logger.info("当前用户"+jack);
        Integer l1 = new Integer(10);
        Integer l2 = 10;
        System.out.println(l2);
        System.out.println(l2);
        System.out.println(l1 == l2);


    }
}
