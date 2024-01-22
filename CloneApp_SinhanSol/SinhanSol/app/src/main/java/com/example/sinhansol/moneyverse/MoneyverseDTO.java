package com.example.sinhansol.moneyverse;

public class MoneyverseDTO {
    private String tv_title, tv_subtitle, tv_context, tv_btn;
    private int imgv_src;

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    private int background;

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTv_subtitle() {
        return tv_subtitle;
    }

    public void setTv_subtitle(String tv_subtitle) {
        this.tv_subtitle = tv_subtitle;
    }

    public String getTv_context() {
        return tv_context;
    }

    public void setTv_context(String tv_context) {
        this.tv_context = tv_context;
    }

    public String getTv_btn() {
        return tv_btn;
    }

    public void setTv_btn(String tv_btn) {
        this.tv_btn = tv_btn;
    }

    public int getImgv_src() {
        return imgv_src;
    }

    public void setImgv_src(int imgv_src) {
        this.imgv_src = imgv_src;
    }

    public MoneyverseDTO(String tv_title, String tv_subtitle, String tv_context, String tv_btn, int imgv_src, int background) {
        this.tv_title = tv_title;
        this.tv_subtitle = tv_subtitle;
        this.tv_context = tv_context;
        this.tv_btn = tv_btn;
        this.imgv_src = imgv_src;
        this.background = background;
    }
}
