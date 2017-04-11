package edu.ezd.model;

import java.util.List;

/**
 * 工作类型表
 * Created by JayJay on 2017/4/9.
 */
public class RecruitmentDetailsType {
    private int recruitmentDetailsTypeId;
    private String recruitmentDetailsTypeName;  //工作类型名称
    private List<RecruitmentDetails> recruitmentDetailss;   //关联岗位详情表

    public int getRecruitmentDetailsTypeId() {
        return recruitmentDetailsTypeId;
    }

    public void setRecruitmentDetailsTypeId(int recruitmentDetailsTypeId) {
        this.recruitmentDetailsTypeId = recruitmentDetailsTypeId;
    }

    public String getRecruitmentDetailsTypeName() {
        return recruitmentDetailsTypeName;
    }

    public void setRecruitmentDetailsTypeName(String recruitmentDetailsTypeName) {
        this.recruitmentDetailsTypeName = recruitmentDetailsTypeName;
    }

    public List<RecruitmentDetails> getRecruitmentDetailss() {
        return recruitmentDetailss;
    }

    public void setRecruitmentDetailss(List<RecruitmentDetails> recruitmentDetailss) {
        this.recruitmentDetailss = recruitmentDetailss;
    }

    @Override
    public String toString() {
        return "RecruitmentDetailsType{" +
                "recruitmentDetailsType=" + recruitmentDetailsTypeId +
                ", recruitmentDetailsTypeName='" + recruitmentDetailsTypeName + '\'' +
                ", recruitmentDetailss=" + recruitmentDetailss +
                '}';
    }
}
