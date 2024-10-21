package com.project.demo.arraylistdeom;

public class User {
    private String userName;
    private String id;
    private String password;

    public User(){

    }

    public User(String userName, String id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
