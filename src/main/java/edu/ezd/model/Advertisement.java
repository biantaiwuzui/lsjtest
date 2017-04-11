package edu.ezd.model;

/**
 * 广告表
 * Created by JayJay on 2017/4/7.
 */

public class Advertisement {
    private int advertisementId;
    private String advertisementImg; // 广告图片
    private String advertisementTitle; //   广告标题（超链接广告用的）
    private String advertisementContent;    // 广告内容
    private String advertisingUrl;  //广告链接
    private String advertisingContact; // 广告联系人
    private String advertisingPosition; //广告位置
    private String advertisingType; //广告类型
    private String advertisingStatue;  // 广告状态

    public int getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(int advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getAdvertisementImg() {
        return advertisementImg;
    }

    public void setAdvertisementImg(String advertisementImg) {
        this.advertisementImg = advertisementImg;
    }

    public String getAdvertisementTitle() {
        return advertisementTitle;
    }

    public void setAdvertisementTitle(String advertisementTitle) {
        this.advertisementTitle = advertisementTitle;
    }

    public String getAdvertisementContent() {
        return advertisementContent;
    }

    public void setAdvertisementContent(String advertisementContent) {
        this.advertisementContent = advertisementContent;
    }

    public String getAdvertisingUrl() {
        return advertisingUrl;
    }

    public void setAdvertisingUrl(String advertisingUrl) {
        this.advertisingUrl = advertisingUrl;
    }

    public String getAdvertisingContact() {
        return advertisingContact;
    }

    public void setAdvertisingContact(String advertisingContact) {
        this.advertisingContact = advertisingContact;
    }

    public String getAdvertisingPosition() {
        return advertisingPosition;
    }

    public void setAdvertisingPosition(String advertisingPosition) {
        this.advertisingPosition = advertisingPosition;
    }

    public String getAdvertisingType() {
        return advertisingType;
    }

    public void setAdvertisingType(String advertisingType) {
        this.advertisingType = advertisingType;
    }

    public String getAdvertisingStatue() {
        return advertisingStatue;
    }

    public void setAdvertisingStatue(String advertisingStatue) {
        this.advertisingStatue = advertisingStatue;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advertisementId=" + advertisementId +
                ", advertisementImg='" + advertisementImg + '\'' +
                ", advertisementTitle='" + advertisementTitle + '\'' +
                ", advertisementContent='" + advertisementContent + '\'' +
                ", advertisingUrl='" + advertisingUrl + '\'' +
                ", advertisingContact='" + advertisingContact + '\'' +
                ", advertisingPosition='" + advertisingPosition + '\'' +
                ", advertisingType='" + advertisingType + '\'' +
                ", advertisingStatue='" + advertisingStatue + '\'' +
                '}';
    }
}
