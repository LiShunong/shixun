package com.example.wlw.myshixun1;

/**
 * Created by wlw on 2016/12/8.
 */
public class Fruit {

    private String title;
    private String desc;
    private int imageID;

    public Fruit(int imageID ,String title,String desc){
        this.desc=desc;
        this.imageID=imageID;
        this.title=title;
    }
    public String getDesc(){
        return desc;
    }
    public int getImageID(){
        return imageID;
    }
    public String getTitle(){
        return title;
    }
}
