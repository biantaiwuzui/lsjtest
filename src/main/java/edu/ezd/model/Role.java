package edu.ezd.model;

import java.util.List;

/**
 * 权限表
 * Created by JayJay on 2017/4/7.
 */
public class Role {
    private int roleId;     //角色id
    private String roleName;    //角色名称
    private List<User_role> user_roles; //用户角色
    private List<Role_permission> role_permissions;  //角色权限

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User_role> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(List<User_role> user_roles) {
        this.user_roles = user_roles;
    }

    public List<Role_permission> getRole_permissions() {
        return role_permissions;
    }

    public void setRole_permissions(List<Role_permission> role_permissions) {
        this.role_permissions = role_permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", user_roles=" + user_roles +
                ", role_permissions=" + role_permissions +
                '}';
    }
}
