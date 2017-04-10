package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class User_role {
    private int userRoleId;
    private Users users;    //用户
    private Role role;      //角色

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User_role{" +
                "userRoleId=" + userRoleId +
                ", users=" + users +
                ", role=" + role +
                '}';
    }
}
