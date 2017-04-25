package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/24.
 */
public class PostBrowse {
    private int postBrowseId;
    private int browse_user;
    private int postId;
    private Users users;
    private Post post;


    public int getPostBrowseId() {
        return postBrowseId;
    }

    public void setPostBrowseId(int postBrowseId) {
        this.postBrowseId = postBrowseId;
    }

    public int getBrowse_user() {
        return browse_user;
    }

    public void setBrowse_user(int browse_user) {
        this.browse_user = browse_user;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
