package edu.ezd.model;

import java.util.List;

/**
 * 企业类型表
 * Created by JayJay on 2017/4/7.
 */
public class EnterpriseType {
    private int enterpriseTypeId;
    private String enterpriseTypeName;  //企业类型名称
    private List<Enterprise> enterprises;   //企业

    public int getEnterpriseTypeId() {
        return enterpriseTypeId;
    }

    public void setEnterpriseTypeId(int enterpriseTypeId) {
        this.enterpriseTypeId = enterpriseTypeId;
    }

    public String getEnterpriseTypeName() {
        return enterpriseTypeName;
    }

    public void setEnterpriseTypeName(String enterpriseTypeName) {
        this.enterpriseTypeName = enterpriseTypeName;
    }

    public List<Enterprise> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(List<Enterprise> enterprises) {
        this.enterprises = enterprises;
    }



    @Override
    public String toString() {
        return "EnterpriseType{" +
                "enterpriseTypeId=" + enterpriseTypeId +
                ", enterpriseTypeName='" + enterpriseTypeName + '\'' +
                ", enterprises=" + enterprises +
                '}';
    }
}
