package edu.ezd.model;

import java.util.List;

/**
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

    @Override
    public String toString() {
        return "SchoolType{" +
                "schoolTypeId=" + schoolTypeId +
                ", schoolTypeName='" + schoolTypeName + '\'' +
                ", schools=" + schools +
                '}';
    }
}
