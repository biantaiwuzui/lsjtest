package edu.ezd.model;

import java.util.Date;

/**
 * Created by JayJay on 2017/4/7.
 */
public class Interview {
    private int interviewId;
    private int interviewStatue;
    private Date interviewDate;
    private int take_interviewStatue;
    private Enterprise enterprise;
    private Users users;
    private Resume resume;

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public int getInterviewStatue() {
        return interviewStatue;
    }

    public void setInterviewStatue(int interviewStatue) {
        this.interviewStatue = interviewStatue;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public int getTake_interviewStatue() {
        return take_interviewStatue;
    }

    public void setTake_interviewStatue(int take_interviewStatue) {
        this.take_interviewStatue = take_interviewStatue;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "interviewId=" + interviewId +
                ", interviewStatue=" + interviewStatue +
                ", interviewDate=" + interviewDate +
                ", take_interviewStatue=" + take_interviewStatue +
                ", enterprise=" + enterprise +
                ", users=" + users +
                ", resume=" + resume +
                '}';
    }
}
