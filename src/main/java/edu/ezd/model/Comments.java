package edu.ezd.model;

import java.util.Date;
import java.util.List;

/**
 * 评论表
 * Created by JayJay on 2017/4/7.
 */
public class Comments {
    private int commentId;
    private String commentContent;  //评论内容
    private Date commentDate;  //评论时间
    private Article article;    //评论的文章
    private Users users;    //评论的用户
    private List<GoodByComments> goodByCommentss; //点赞表

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<GoodByComments> getGoodByCommentss() {
        return goodByCommentss;
    }

    public void setGoodByCommentss(List<GoodByComments> goodByCommentss) {
        this.goodByCommentss = goodByCommentss;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", commentContent='" + commentContent + '\'' +
                ", commentDate=" + commentDate +
                ", article=" + article +
                ", users=" + users +
                ", goodByCommentss=" + goodByCommentss +
                '}';
    }
}
