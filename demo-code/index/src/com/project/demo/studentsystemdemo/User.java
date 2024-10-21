package com.project.demo.studentsystemdemo;

public class User {
    private String userName;
    private String password;
    private String idCardNumber;
    private String phoneNumber;

    public User() {

    }

    public User(String userName, String password, String idCardNumber, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public User setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
