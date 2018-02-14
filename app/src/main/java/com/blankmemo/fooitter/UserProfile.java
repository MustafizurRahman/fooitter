package com.blankmemo.fooitter;

/**
 * Created by hongyuchen on 2018-02-13.
 */

public class UserProfile {
    private String firstName;
    private String lastName;
    private String profilePicture;
    private Integer userAge;


    public UserProfile(String firstName, String lastName, String profilePicture, Integer userAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePicture = profilePicture;
        this.userAge = userAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
