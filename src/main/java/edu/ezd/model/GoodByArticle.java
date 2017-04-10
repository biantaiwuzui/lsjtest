package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class GoodByArticle {
    private int goodByArticleId;
    private int getGoodByArticle_statue;    //点赞状态
    private Users users;    //点赞的人
    private Article article;    //点赞的文章

    public int getGoodByArticleId() {
        return goodByArticleId;
    }

    public void setGoodByArticleId(int goodByArticleId) {
        this.goodByArticleId = goodByArticleId;
    }

    public int getGetGoodByArticle_statue() {
        return getGoodByArticle_statue;
    }

    public void setGetGoodByArticle_statue(int getGoodByArticle_statue) {
        this.getGoodByArticle_statue = getGoodByArticle_statue;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "GoodByArticle{" +
                "goodByArticleId=" + goodByArticleId +
                ", getGoodByArticle_statue=" + getGoodByArticle_statue +
                ", users=" + users +
                ", article=" + article +
                '}';
    }
}
