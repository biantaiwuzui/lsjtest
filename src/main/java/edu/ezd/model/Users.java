package edu.ezd.model;

import netscape.security.UserTarget;

import java.util.List;

/**
 * 用户表
 * Created by JayJay on 2017/4/7.
 */
public class Users {
    private int userId;         //用户id
    private String userName;    //帐号
    private String password;    //密码
    private String userType;    //用户类型
    private String token;       //手机短信验证码
    private List<User_role> user_roles;     //用户角色表
    private UserInfo userInfo;              //用户信息
    private List<User_enterprise> user_enterprises; //关注企业
    private List<FeedBack> feedBacks;       //意见反馈
    private List<Article> articles;         //就业指导
    private List<Browse> browses;           //浏览过的文章
    private List<Comments> comments;        //评论
    private List<TheAttractionApplicant> theAttractionApplicants;//我的大招会
    private List<Interview> interviews;     //面试表
    private UserTotal userTotal;            //操作统计表
    private Verification verification;      //实名认证


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<User_role> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(List<User_role> user_roles) {
        this.user_roles = user_roles;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<User_enterprise> getUser_enterprises() {
        return user_enterprises;
    }

    public void setUser_enterprises(List<User_enterprise> user_enterprises) {
        this.user_enterprises = user_enterprises;
    }

    public List<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public void setFeedBacks(List<FeedBack> feedBacks) {
        this.feedBacks = feedBacks;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Browse> getBrowses() {
        return browses;
    }

    public void setBrowses(List<Browse> browses) {
        this.browses = browses;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }


    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public UserTotal getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(UserTotal userTotal) {
        this.userTotal = userTotal;
    }

    public Verification getVerification() {
        return verification;
    }

    public void setVerification(Verification verification) {
        this.verification = verification;
    }

    public List<TheAttractionApplicant> getTheAttractionApplicants() {
        return theAttractionApplicants;
    }

    public void setTheAttractionApplicants(List<TheAttractionApplicant> theAttractionApplicants) {
        this.theAttractionApplicants = theAttractionApplicants;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", token='" + token + '\'' +
                ", user_roles=" + user_roles +
                ", userInfo=" + userInfo +
                ", user_enterprises=" + user_enterprises +
                ", feedBacks=" + feedBacks +
                ", articles=" + articles +
                ", browses=" + browses +
                ", comments=" + comments +
                ", theAttractionApplicants=" + theAttractionApplicants +
                ", interviews=" + interviews +
                ", userTotal=" + userTotal +
                ", verification=" + verification +
                '}';
    }
}
