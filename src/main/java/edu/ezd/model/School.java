package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class School {
    private int schoolId;
    private String schoolName;  //学校名称
    private String schoolAddress;   //学校地址
    private String schert_detail;   //校招会详情
    private int schoolCount;    //校招会常熟
    private SchoolType schoolType;  //学校类型

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchert_detail() {
        return schert_detail;
    }

    public void setSchert_detail(String schert_detail) {
        this.schert_detail = schert_detail;
    }

    public int getSchoolCount() {
        return schoolCount;
    }

    public void setSchoolCount(int schoolCount) {
        this.schoolCount = schoolCount;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schert_detail='" + schert_detail + '\'' +
                ", schoolCount=" + schoolCount +
                ", schoolType=" + schoolType +
                '}';
    }
}
