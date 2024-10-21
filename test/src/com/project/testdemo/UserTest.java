package com.project.testdemo;

public class UserTest {
    public static void main(String[] args) {
//        User user = new User("HuTao", 18, "114514", "Null", "女");
        User user = new User();
        user.getThis().setUserName("QiQi").setEmail("None").setGender("女").setAge(18).setPassword("0721");
        System.out.println(user);
    }
}
