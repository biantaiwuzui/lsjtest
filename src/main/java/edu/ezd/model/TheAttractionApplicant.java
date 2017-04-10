package edu.ezd.model;

/**
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

    @Override
    public String toString() {
        return "TheAttractionApplicant{" +
                "applicantId=" + applicantId +
                ", theAttraction=" + theAttraction +
                ", users=" + users +
                '}';
    }
}
