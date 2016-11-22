package com.example.android.chicagotourapp;
//
/**
 * Created by Jaron on 9/15/16.
 */
public class Attraction {
    private String mName;
    private String mLocation;
    private String mLink;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String name, String location, String link, int imageResourceId) {
        mName = name;
        mLocation = location;
        mLink = link;
        mImageResourceId = imageResourceId;
    }

    public Attraction(String name, String location, String link) {
        mName = name;
        mLocation = location;
        mLink = link;
        mImageResourceId = NO_IMAGE_PROVIDED;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getLink() {
        return mLink;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
