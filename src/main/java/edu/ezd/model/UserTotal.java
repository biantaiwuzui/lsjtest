package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class UserTotal {
    private int userTotalId;
    private int totalEnrollment;
    private int cancellationNumber;
    private int numberOfEmployed;
    private int userTermination;
    private int enterpriseTermination;
    private int alreadyCompleted;
    private Users users;

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

    @Override
    public String toString() {
        return "UserTotal{" +
                "userTotalId=" + userTotalId +
                ", totalEnrollment=" + totalEnrollment +
                ", cancellationNumber=" + cancellationNumber +
                ", numberOfEmployed=" + numberOfEmployed +
                ", userTermination=" + userTermination +
                ", enterpriseTermination=" + enterpriseTermination +
                ", alreadyCompleted=" + alreadyCompleted +
                ", users=" + users +
                '}';
    }
}
