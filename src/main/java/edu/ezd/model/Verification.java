package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class Verification {
    private int verificationId;
    private String RealName;
    private String idCard;
    private String phone;
    private String imageFont;
    private String imageBack;
    private Users users;

    public int getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(int verificationId) {
        this.verificationId = verificationId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
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
