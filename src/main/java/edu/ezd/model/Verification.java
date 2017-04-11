package edu.ezd.model;

/**
 * 实名认证表
 * Created by JayJay on 2017/4/7.
 */
public class Verification {
    private int verificationId;
    private String realName;    //真实姓名
    private String idCard;  //身份证号码
    private String phone;   //手机号码
    private String imageFont;   //身份证正面
    private String imageBack;   //身份证背面
    private Users users;    //对应用户

    public int getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(int verificationId) {
        this.verificationId = verificationId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageFont() {
        return imageFont;
    }

    public void setImageFont(String imageFont) {
        this.imageFont = imageFont;
    }

    public String getImageBack() {
        return imageBack;
    }

    public void setImageBack(String imageBack) {
        this.imageBack = imageBack;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
