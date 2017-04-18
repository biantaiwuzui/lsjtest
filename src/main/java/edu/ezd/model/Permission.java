package edu.ezd.model;

import java.util.List;

/**
 * 权限表
 * Created by JayJay on 2017/4/7.
 */
public class Permission {
    private int permissionId;   //权限id
    private String permissionName;  //权限名称
    private List<Role_permission> role_permissions; //角色权限表

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<Role_permission> getRole_permissions() {
        return role_permissions;
    }

    public void setRole_permissions(List<Role_permission> role_permissions) {
        this.role_permissions = role_permissions;
    }

}
