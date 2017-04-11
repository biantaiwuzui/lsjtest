package edu.ezd.model;

import java.util.Date;

/**
 * 面试表
 * Created by JayJay on 2017/4/7.
 */
public class Interview {
    private int interviewId;
    private int interviewStatue;    //状态，默认（0，待审核，1，通过，2，不通过）
    private Date interviewDate;      //面试时间
    private int take_interviewStatue;    //投递简历的状态，1，投简历，2，取消应聘
    private Enterprise enterprise;          //面试的企业
    private Users users;                //面试者
    private Resume resume;              //简历

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
