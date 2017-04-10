package edu.ezd.model;

import java.util.List;

/**
 * Created by JayJay on 2017/4/7.
 */
public class Enterprise {
    private int enterpriseId;
    private String enterpriseName;  //企业名称
    private String enterpriseIcon;  //企业图标
    private String enterpriseAddress;   //企业地址
    private String enterpriseScale; //企业规模
    private String enterpriseIntroduction;  //企业介绍
    private EnterpriseType enterpriseType;  //企业类型
    private List<Post> posts;   //企业职位
    private List<Interview> interviews; //面试的人


    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseIcon() {
        return enterpriseIcon;
    }

    public void setEnterpriseIcon(String enterpriseIcon) {
        this.enterpriseIcon = enterpriseIcon;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale;
    }

    public String getEnterpriseIntroduction() {
        return enterpriseIntroduction;
    }

    public void setEnterpriseIntroduction(String enterpriseIntroduction) {
        this.enterpriseIntroduction = enterpriseIntroduction;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseId=" + enterpriseId +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", enterpriseIcon='" + enterpriseIcon + '\'' +
                ", enterpriseAddress='" + enterpriseAddress + '\'' +
                ", enterpriseScale='" + enterpriseScale + '\'' +
                ", enterpriseIntroduction='" + enterpriseIntroduction + '\'' +
                ", enterpriseType=" + enterpriseType +
                ", posts=" + posts +
                ", interviews=" + interviews +
                '}';
    }
}
