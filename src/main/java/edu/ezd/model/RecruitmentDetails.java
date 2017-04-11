package edu.ezd.model;

/**
 * 岗位详情表
 * Created by JayJay on 2017/4/7.
 */
public class RecruitmentDetails {
    private int RecruitmentDetailsId;
    private String jobRequirements;      //工作要求
    private String genderRequirements;   //性别要求
    private String educationalRequirements;  //学历要求
    private String companyBenefits; //公司福利（五险一金）
    private String jobContent;   //工作内容
    private String salary;   //薪水
    private Post post;  //关联的招聘信息表
    private RecruitmentDetailsType recruitmentDetailsType; //工作类型（实习或全职）

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

    public String getEducationalRequirements() {
        return educationalRequirements;
    }

    public void setEducationalRequirements(String educationalRequirements) {
        this.educationalRequirements = educationalRequirements;
    }

    public String getCompanyBenefits() {
        return companyBenefits;
    }

    public void setCompanyBenefits(String companyBenefits) {
        this.companyBenefits = companyBenefits;
    }
}
