package com.houjun.domain;

/**
 * 角色
 */
public class Role {
    private Integer id;//int(11) NOT NULL,
    private String roleName;//varchar(255) DEFAULT NULL,
    private String roleDesc;//varchar(255) DEFAULT NULL,

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
