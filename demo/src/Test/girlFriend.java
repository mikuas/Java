package Test;

public class girlFriend {
    String gender, name;
    int height;
    private int age;

    public void setAge(int a) {
        if (a >= 18 && a <= 30) {
            age = a;
        } else {
            System.out.println("输入数据非法!");
        }
    }

    public int getAge() {
        return age;
    }

    public void playGame(String youName) {
        System.out.println(youName + "和" + name + "van游戏");
    }

    public void qiaFan(String youName) {
        System.out.println(youName + "和" + name + "一起次饭");
    }

    public void getInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("身高: " + height);
        System.out.println("性别: " + gender);
    }
}
