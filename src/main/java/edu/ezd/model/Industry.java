package edu.ezd.model;

import java.util.List;

/**
 * 行业表
 * Created by JayJay on 2017/4/9.
 */
public class Industry {
    private int industryId;
    private String industryName;    //行业名称
    private List<Enterprise> enterprises;   //关联的企业
    private List<PositionName> positionNames;   //关联岗位名称

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public List<Enterprise> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(List<Enterprise> enterprises) {
        this.enterprises = enterprises;
    }

    public List<PositionName> getPositionNames() {
        return positionNames;
    }

    public void setPositionNames(List<PositionName> positionNames) {
        this.positionNames = positionNames;
    }


}
