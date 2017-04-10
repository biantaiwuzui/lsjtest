package edu.ezd.model;

/**
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

    @Override
    public String toString() {
        return "Browse{" +
                "browseId=" + browseId +
                ", users=" + users +
                ", article=" + article +
                '}';
    }
}
