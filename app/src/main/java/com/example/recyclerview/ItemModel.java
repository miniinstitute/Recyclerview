package com.example.recyclerview;

public class ItemModel {

    private String bcsTitle ;
    private String bcsSubTitle;
    private int bcsPhoto;


    public ItemModel(String bcsTitle, String bcsSubTitle, int bcsPhoto) {
        this.bcsTitle = bcsTitle;
        this.bcsSubTitle = bcsSubTitle;
        this.bcsPhoto = bcsPhoto;
    }

    public String getBcsTitle() {
        return bcsTitle;
    }

    public void setBcsTitle(String bcsTitle) {
        this.bcsTitle = bcsTitle;
    }

    public String getBcsSubTitle() {
        return bcsSubTitle;
    }

    public void setBcsSubTitle(String bcsSubTitle) {
        this.bcsSubTitle = bcsSubTitle;
    }

    public int getBcsPhoto() {
        return bcsPhoto;
    }

    public void setBcsPhoto(int bcsPhoto) {
        this.bcsPhoto = bcsPhoto;
    }
}