package edu.ezd.model;

import java.util.List;

/**
 * 学校类型表
 * Created by JayJay on 2017/4/7.
 */
public class SchoolType {
    private int schoolTypeId;
    private String schoolTypeName;  //学校类型名称
    private List<School> schools;   //学校

    public int getSchoolTypeId() {
        return schoolTypeId;
    }

    public void setSchoolTypeId(int schoolTypeId) {
        this.schoolTypeId = schoolTypeId;
    }

    public String getSchoolTypeName() {
        return schoolTypeName;
    }

    public void setSchoolTypeName(String schoolTypeName) {
        this.schoolTypeName = schoolTypeName;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }


}
