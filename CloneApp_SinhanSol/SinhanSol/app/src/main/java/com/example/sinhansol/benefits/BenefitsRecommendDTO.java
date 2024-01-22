package com.example.sinhansol.benefits;

public class BenefitsRecommendDTO {

    private int imgRes;

    private String text1, text2, text3;






    public BenefitsRecommendDTO(int imgRes, String text1, String text2, String text3) {
        this.imgRes = imgRes;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }
}
