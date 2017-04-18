package edu.ezd.model;

/**
 * 浏览过文章记录表
 * Created by JayJay on 2017/4/7.
 */
public class Browse {
    private int browseId;
    private Users users;    //浏览的用户
    private Article article;    //浏览的文章

    public int getBrowseId() {
        return browseId;
    }

    public void setBrowseId(int browseId) {
        this.browseId = browseId;
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


}
