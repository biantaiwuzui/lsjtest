package edu.ezd.model;

import java.util.List;

/**
 * 岗位名称表
 * Created by JayJay on 2017/4/9.
 */
public class PositionName {
    private int positionNameId;
    private String pname;   //岗位名称（即：程序员，文员，客户经理等）
    private Industry industry;   //对应的行业
    private List<Post> posts;       //对应的企业招聘岗位表

    public int getPositionNameId() {
        return positionNameId;
    }

    public void setPositionNameId(int positionNameId) {
        this.positionNameId = positionNameId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


}
