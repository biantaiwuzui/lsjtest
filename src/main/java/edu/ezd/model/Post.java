package edu.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * Created by JayJay on 2017/4/7.
 */
public class Post {
    private int postId;
    private String post_title;
    private Date sendPostDate;
    private String contacts;
    private String contactsInformation;
    private String recruitmentNumber;
    private Enterprise enterprise;
    private List<RecruitmentDetails> recruitmentDetailss;

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

    public String getContactsInformation() {
        return contactsInformation;
    }

    public void setContactsInformation(String contactsInformation) {
        this.contactsInformation = contactsInformation;
    }

    public String getRecruitmentNumber() {
        return recruitmentNumber;
    }

    public void setRecruitmentNumber(String recruitmentNumber) {
        this.recruitmentNumber = recruitmentNumber;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<RecruitmentDetails> getRecruitmentDetailss() {
        return recruitmentDetailss;
    }

    public void setRecruitmentDetailss(List<RecruitmentDetails> recruitmentDetailss) {
        this.recruitmentDetailss = recruitmentDetailss;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", post_title='" + post_title + '\'' +
                ", sendPostDate=" + sendPostDate +
                ", contacts='" + contacts + '\'' +
                ", contactsInformation='" + contactsInformation + '\'' +
                ", recruitmentNumber='" + recruitmentNumber + '\'' +
                ", enterprise=" + enterprise +
                ", recruitmentDetailss=" + recruitmentDetailss +
                '}';
    }
}
