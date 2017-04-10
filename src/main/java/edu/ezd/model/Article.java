package edu.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * Created by JayJay on 2017/4/7.
 */
public class Article {
    private int articleId;
    private String mainTitle;   //主标题
    private String subTitle;    //副标题
    private String articleImg;  //文章图片
    private String content; //内容
    private Date sendDate;  //发布时间
    private String sendByUser_email;    //作者邮箱
    private int article_statue; //状态
    private Users users;    //作者
    private List<Browse> browses;
    private List<Comments> commentss;   //评论
    private List<GoodByArticle> goodByArticles; //点赞

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendByUser_email() {
        return sendByUser_email;
    }

    public void setSendByUser_email(String sendByUser_email) {
        this.sendByUser_email = sendByUser_email;
    }

    public int getArticle_statue() {
        return article_statue;
    }

    public void setArticle_statue(int article_statue) {
        this.article_statue = article_statue;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<Browse> getBrowses() {
        return browses;
    }

    public void setBrowses(List<Browse> browses) {
        this.browses = browses;
    }

    public List<Comments> getCommentss() {
        return commentss;
    }

    public void setCommentss(List<Comments> commentss) {
        this.commentss = commentss;
    }

    public List<GoodByArticle> getGoodByArticles() {
        return goodByArticles;
    }

    public void setGoodByArticles(List<GoodByArticle> goodByArticles) {
        this.goodByArticles = goodByArticles;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", mainTitle='" + mainTitle + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", articleImg='" + articleImg + '\'' +
                ", content='" + content + '\'' +
                ", sendDate=" + sendDate +
                ", sendByUser_email='" + sendByUser_email + '\'' +
                ", article_statue=" + article_statue +
                ", users=" + users +
                ", browses=" + browses +
                ", commentss=" + commentss +
                ", goodByArticles=" + goodByArticles +
                '}';
    }
}
