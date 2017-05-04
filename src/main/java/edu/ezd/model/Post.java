package edu.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * 招聘信息表
 * Created by JayJay on 2017/4/7.
 */
public class Post {
    private int postId;
    private String post_title;  //招聘岗位的标题
    private Date sendPostDate;   //发布时间
    private String contacts;     //联系人
    private String contactInformation;  //联系人电话
    private String recruitmentNumber;    //招聘人数
    private int positionNameId;
    private int enterpriseId;
    private Enterprise enterprise;   //企业信息
    private RecruitmentDetails recruitmentDetails;    //岗位详情表
    private PositionName positionName; //岗位名称
    private List<PostBrowse> postBrowses;   //浏览记录表

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public Date getSendPostDate() {
        return sendPostDate;
    }

    public void setSendPostDate(Date sendPostDate) {
        this.sendPostDate = sendPostDate;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getRecruitmentNumber() {
        return recruitmentNumber;
    }

    public void setRecruitmentNumber(String recruitmentNumber) {
        this.recruitmentNumber = recruitmentNumber;
    }

    public int getPositionNameId() {
        return positionNameId;
    }

    public void setPositionNameId(int positionNameId) {
        this.positionNameId = positionNameId;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public RecruitmentDetails getRecruitmentDetails() {
        return recruitmentDetails;
    }

    public void setRecruitmentDetails(RecruitmentDetails recruitmentDetails) {
        this.recruitmentDetails = recruitmentDetails;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }

    public List<PostBrowse> getPostBrowses() {
        return postBrowses;
    }

    public void setPostBrowses(List<PostBrowse> postBrowses) {
        this.postBrowses = postBrowses;
    }
}
