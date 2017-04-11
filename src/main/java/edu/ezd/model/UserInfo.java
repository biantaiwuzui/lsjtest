package edu.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * 用户信息表
 * Created by JayJay on 2017/4/7.
 */
public class UserInfo {
    private int userInfoId;
    private Date birthday;  //生日
    private String headPortrait;    //用户头像
    private String phone;           //手机号码
    private String nickName;    //姓名
    private String school;  //学校
    private int sex;    //性别
    private String jobIntention;    //求职意向
    private List<FeedBack> feedBacks;//意见反馈
    private Users users;    //用户
    private List<Resume> resumes;   //简历

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getJobIntention() {
        return jobIntention;
    }

    public void setJobIntention(String jobIntention) {
        this.jobIntention = jobIntention;
    }

    public List<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public void setFeedBacks(List<FeedBack> feedBacks) {
        this.feedBacks = feedBacks;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Resume> getResumes() {
        return resumes;
    }

    public void setResumes(List<Resume> resumes) {
        this.resumes = resumes;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoId=" + userInfoId +
                ", birthday=" + birthday +
                ", headPortrait='" + headPortrait + '\'' +
                ", phone='" + phone + '\'' +
                ", nickName='" + nickName + '\'' +
                ", school='" + school + '\'' +
                ", sex=" + sex +
                ", jobIntention='" + jobIntention + '\'' +
                ", feedBacks=" + feedBacks +
                ", users=" + users +
                ", resumes=" + resumes +
                '}';
    }
}
