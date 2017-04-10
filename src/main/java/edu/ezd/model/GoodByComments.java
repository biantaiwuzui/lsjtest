package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class GoodByComments {
    private int gid;
    private int goodBycomments_statue;  //状态
    private Comments comments;  //点赞的评论
    private Users users;    //点赞的用户

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGoodBycomments_statue() {
        return goodBycomments_statue;
    }

    public void setGoodBycomments_statue(int goodBycomments_statue) {
        this.goodBycomments_statue = goodBycomments_statue;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "GoodByComments{" +
                "gid=" + gid +
                ", goodBycomments_statue=" + goodBycomments_statue +
                ", comments=" + comments +
                ", users=" + users +
                '}';
    }
}
