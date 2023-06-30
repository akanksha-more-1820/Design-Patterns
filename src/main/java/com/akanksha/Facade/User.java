package com.akanksha.Facade;

public class User {

    private String userName;
    private String emailAddress;
    private String phoneNo;

    public User(String userName, String emailAddress, String phoneNo) {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
