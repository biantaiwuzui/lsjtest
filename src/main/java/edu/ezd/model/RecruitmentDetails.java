package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/7.
 */
public class RecruitmentDetails {
    private int RecruitmentDetailsId;
    private String jobRequirements;
    private String genderRequirements;
    private String EducationalRequirements;
    private String jobContent;
    private String salary;
    private Post post;
    private RecruitmentDetailsType recruitmentDetailsType;

    public int getRecruitmentDetailsId() {
        return RecruitmentDetailsId;
    }

    public void setRecruitmentDetailsId(int recruitmentDetailsId) {
        RecruitmentDetailsId = recruitmentDetailsId;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public String getGenderRequirements() {
        return genderRequirements;
    }

    public void setGenderRequirements(String genderRequirements) {
        this.genderRequirements = genderRequirements;
    }

    public String getEducationalRequirements() {
        return EducationalRequirements;
    }

    public void setEducationalRequirements(String educationalRequirements) {
        EducationalRequirements = educationalRequirements;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public RecruitmentDetailsType getRecruitmentDetailsType() {
        return recruitmentDetailsType;
    }

    public void setRecruitmentDetailsType(RecruitmentDetailsType recruitmentDetailsType) {
        this.recruitmentDetailsType = recruitmentDetailsType;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "RecruitmentDetails{" +
                "RecruitmentDetailsId=" + RecruitmentDetailsId +
                ", jobRequirements='" + jobRequirements + '\'' +
                ", genderRequirements='" + genderRequirements + '\'' +
                ", EducationalRequirements='" + EducationalRequirements + '\'' +
                ", jobContent='" + jobContent + '\'' +
                ", salary='" + salary + '\'' +
                ", post=" + post +
                ", recruitmentDetailsType=" + recruitmentDetailsType +
                '}';
    }
}
