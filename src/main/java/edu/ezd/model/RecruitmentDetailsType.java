package edu.ezd.model;

import java.util.List;

/**
 * Created by JayJay on 2017/4/9.
 */
public class RecruitmentDetailsType {
    private int recruitmentDetailsType;
    private String recruitmentDetailsTypeName;
    private List<RecruitmentDetails> recruitmentDetailss;

    public int getRecruitmentDetailsType() {
        return recruitmentDetailsType;
    }

    public void setRecruitmentDetailsType(int recruitmentDetailsType) {
        this.recruitmentDetailsType = recruitmentDetailsType;
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
                "recruitmentDetailsType=" + recruitmentDetailsType +
                ", recruitmentDetailsTypeName='" + recruitmentDetailsTypeName + '\'' +
                ", recruitmentDetailss=" + recruitmentDetailss +
                '}';
    }
}
