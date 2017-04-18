package edu.ezd.model;

/**
 * 大招会报名表
 * Created by JayJay on 2017/4/9.
 */
public class TheAttractionApplicant {
    private int applicantId;
    private TheAttraction theAttraction;
    private Users users;

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public TheAttraction getTheAttraction() {
        return theAttraction;
    }

    public void setTheAttraction(TheAttraction theAttraction) {
        this.theAttraction = theAttraction;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


}
