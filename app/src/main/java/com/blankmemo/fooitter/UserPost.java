package com.blankmemo.fooitter;

/**
 * Created by hongyuchen on 2018-02-19.
 */

public class UserPost {

    private String mFirstName;
    private String mLastName;
    private String mShortDescription;
    private String mProfilePicture;
    private String mPostImage;
    private int mNumberOfViews;

//public constructor
    public UserPost(String firstName, String lastName, String shortDescription, String profilePicture, String postImage, int numberOfViews) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mShortDescription = shortDescription;
        this.mProfilePicture = profilePicture;
        this.mPostImage = postImage;
        this.mNumberOfViews = numberOfViews;
    }
//getters
    public String getmFirstName() {
        return mFirstName;
    }

    public String getmShortDescription() {
        return mShortDescription;
    }

    public String getmLastName() {
        return mLastName;
    }

    public String getmProfilePicture() {
        return mProfilePicture;
    }

    public String getmPostImage() {
        return mPostImage;
    }

    public int getmNumberOfViews() {
        return mNumberOfViews;
    }
//setters
    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public void setmShortDescription(String mShortDescription) {
        this.mShortDescription = mShortDescription;
    }

    public void setmProfilePicture(String mProfilePicture) {
        this.mProfilePicture = mProfilePicture;
    }

    public void setmPostImage(String mPostImage) {
        this.mPostImage = mPostImage;
    }

    public void setmNumberOfViews(int mNumberOfViews) {
        this.mNumberOfViews = mNumberOfViews;
    }
}
