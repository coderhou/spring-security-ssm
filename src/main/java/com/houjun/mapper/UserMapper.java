package com.houjun.mapper;

import com.houjun.domain.Permission;
import com.houjun.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    User findByUsername(String username);

    List<Permission> findPermissionByUsername(String username);

    int update(User user);
}
