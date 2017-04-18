package edu.ezd.model;

/**
 * 用户操作统计表
 * Created by JayJay on 2017/4/7.
 */
public class UserTotal {
    private int userTotalId;
    private int totalEnrollment;    //总报名次数
    private int cancellationNumber; //取消报名次数
    private int numberOfEmployed;   //被录用次数
    private int userTermination;    //用户解约次数
    private int enterpriseTermination;  //企业解约次数
    private int alreadyCompleted;   //已经完工次数
    private Users users;    //关联的用户

    public int getUserTotalId() {
        return userTotalId;
    }

    public void setUserTotalId(int userTotalId) {
        this.userTotalId = userTotalId;
    }

    public int getTotalEnrollment() {
        return totalEnrollment;
    }

    public void setTotalEnrollment(int totalEnrollment) {
        this.totalEnrollment = totalEnrollment;
    }

    public int getCancellationNumber() {
        return cancellationNumber;
    }

    public void setCancellationNumber(int cancellationNumber) {
        this.cancellationNumber = cancellationNumber;
    }

    public int getNumberOfEmployed() {
        return numberOfEmployed;
    }

    public void setNumberOfEmployed(int numberOfEmployed) {
        this.numberOfEmployed = numberOfEmployed;
    }

    public int getUserTermination() {
        return userTermination;
    }

    public void setUserTermination(int userTermination) {
        this.userTermination = userTermination;
    }

    public int getEnterpriseTermination() {
        return enterpriseTermination;
    }

    public void setEnterpriseTermination(int enterpriseTermination) {
        this.enterpriseTermination = enterpriseTermination;
    }

    public int getAlreadyCompleted() {
        return alreadyCompleted;
    }

    public void setAlreadyCompleted(int alreadyCompleted) {
        this.alreadyCompleted = alreadyCompleted;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


}
