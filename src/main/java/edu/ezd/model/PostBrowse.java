package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/24.
 */
public class PostBrowse {
    private int postBrowseId;
    private Users users;
    private Post post;

    public int getPostBrowseId() {
        return postBrowseId;
    }

    public void setPostBrowseId(int postBrowseId) {
        this.postBrowseId = postBrowseId;
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
