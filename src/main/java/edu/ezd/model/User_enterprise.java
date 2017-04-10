package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class User_enterprise {
    private int user_enterprise_id;
    private int user_enterprise_statu;  //状态
    private Users users;    //关注人
    private Enterprise enterprise;  //关注的企业

    public int getUser_enterprise_id() {
        return user_enterprise_id;
    }

    public void setUser_enterprise_id(int user_enterprise_id) {
        this.user_enterprise_id = user_enterprise_id;
    }

    public int getUser_enterprise_statu() {
        return user_enterprise_statu;
    }

    public void setUser_enterprise_statu(int user_enterprise_statu) {
        this.user_enterprise_statu = user_enterprise_statu;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "User_enterprise{" +
                "user_enterprise_id=" + user_enterprise_id +
                ", user_enterprise_statu=" + user_enterprise_statu +
                ", users=" + users +
                ", enterprise=" + enterprise +
                '}';
    }
}
