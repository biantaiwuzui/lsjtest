package edu.ezd.model;

/**
 * 角色权限中间表
 * Created by JayJay on 2017/4/7.
 */
public class Role_permission {
    private int RolePermissionId;
    private Role role;  //角色
    private Permission permission;  //权限

    public int getRolePermissionId() {
        return RolePermissionId;
    }

    public void setRolePermissionId(int rolePermissionId) {
        RolePermissionId = rolePermissionId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }


}
