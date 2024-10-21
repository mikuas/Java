package com.project.testdemo;

public class createGirlFriend {
    public static void main(String[] args) {
        GirlFriend girlFriendOne = new GirlFriend();
//mouse//
        girlFriendOne.setName("HuTao");
        girlFriendOne.setAge(18);
        girlFriendOne.setGender("女");
        girlFriendOne.setHeight(160.5);

        System.out.println(girlFriendOne.getName());
        System.out.println(girlFriendOne.getAge());
        System.out.println(girlFriendOne.getGender());
        System.out.println(girlFriendOne.getHeight());

        girlFriendOne.playGame();
        girlFriendOne.eat();
        girlFriendOne.sleep();
    }
}
