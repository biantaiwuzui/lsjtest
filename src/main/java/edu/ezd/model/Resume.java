package edu.ezd.model;

import java.util.Date;

/**
 * 简历表
 * Created by JayJay on 2017/4/7.
 */
public class Resume {
    private int resumeId;
    private String name;    //姓名
    private Date birthday;  //生日
    private String id_card; //身份证
    private String placeoforigin;   //籍贯
    private String workexperience;  //工作经历
    private String selfevaluation;  //自我评价
    private UserInfo userInfo;  //用户信息
    private Interview interview;    //面试

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getPlaceoforigin() {
        return placeoforigin;
    }

    public void setPlaceoforigin(String placeoforigin) {
        this.placeoforigin = placeoforigin;
    }

    public String getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(String workexperience) {
        this.workexperience = workexperience;
    }

    public String getSelfevaluation() {
        return selfevaluation;
    }

    public void setSelfevaluation(String selfevaluation) {
        this.selfevaluation = selfevaluation;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Interview getInterview() {
        return interview;
    }

    public void setInterview(Interview interview) {
        this.interview = interview;
    }


}
