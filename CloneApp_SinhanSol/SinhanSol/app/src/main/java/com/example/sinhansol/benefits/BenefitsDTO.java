package com.example.sinhansol.benefits;

public class BenefitsDTO {
    private int imgRes;
    private String title, content1, content2;

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public BenefitsDTO(int imgRes, String title, String content1, String content2) {
        this.imgRes = imgRes;
        this.title = title;
        this.content1 = content1;
        this.content2 = content2;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
