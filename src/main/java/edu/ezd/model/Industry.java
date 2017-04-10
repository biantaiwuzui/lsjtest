package edu.ezd.model;

import java.util.List;

/**
 * Created by JayJay on 2017/4/9.
 */
public class Industry {
    private int industryId;
    private String industryName;
    private List<Enterprise> enterprises;
    private List<PositionName> positionNames;

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

    @Override
    public String toString() {
        return "Industry{" +
                "industryId=" + industryId +
                ", industryName='" + industryName + '\'' +
                ", enterprises=" + enterprises +
                ", positionNames=" + positionNames +
                '}';
    }
}
