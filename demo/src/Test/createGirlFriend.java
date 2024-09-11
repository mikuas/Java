package Test;

public class createGirlFriend {
    public static void main(String[] args) {
        girlFriend girlFriendOne = new girlFriend();
//mouse//
        girlFriendOne.gender = "阿帕奇武装直升机";
        girlFriendOne.height = 160;
        girlFriendOne.name = "HuTao";

        girlFriendOne.setAge(18);
        System.out.println(girlFriendOne.getAge());

        girlFriendOne.playGame("Me");
        girlFriendOne.qiaFan("Me");
        girlFriendOne.getInfo();
    }
}
