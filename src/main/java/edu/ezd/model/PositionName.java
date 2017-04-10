package edu.ezd.model;

/**
 * Created by JayJay on 2017/4/9.
 */
public class PositionName {
    private int positionName;
    private String pname;
    private Industry industry;

    public int getPositionName() {
        return positionName;
    }

    public void setPositionName(int positionName) {
        this.positionName = positionName;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "PositionName{" +
                "positionName=" + positionName +
                ", pname='" + pname + '\'' +
                ", industry=" + industry +
                '}';
    }
}
