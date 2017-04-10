package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class FeedBack {
    private int feedBackId;
    private String feedBackProblem; //意见问题
    private String opinion; //问题详情
    private UserInfo userInfo;  //用户信息表

    public int getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }

    public String getFeedBackProblem() {
        return feedBackProblem;
    }

    public void setFeedBackProblem(String feedBackProblem) {
        this.feedBackProblem = feedBackProblem;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "feedBackId=" + feedBackId +
                ", feedBackProblem='" + feedBackProblem + '\'' +
                ", opinion='" + opinion + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }
}
