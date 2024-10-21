package com.project.testdemo;

public class User {
    // 属性
    private String userName, password, email, gender;
    private int age;

    public User() {

    }

    public User(String userName, int age, String password, String email, String gender) {
        this.userName = userName;
        this.age = age;
        this.password = password;
        this.email = email;
        this.gender = gender;
    }

    public User getThis() {
        System.out.println(this);
        return this;
    }
    //快捷键 alt + insert

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    /////////////////////////

    public String userName() {
        return userName;
    }

    public String password() {
        return password;
    }

    public String email() {
        return email;
    }

    public String gender() {
        return gender;
    }

    public int age() {
        return age;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    public String toString() {
        return "User{userName = " + userName + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }
}
