package com.project.testdemo;
// 随机数
import java.util.Random;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(1, 100);

//        System.out.println(number);
        /*
            7 ~ 15
            头尾都减去一个值,让他从0开始 0 ~ 8
            尾巴 +1 = 9
            最终结果,加上第一步减去的值
            int number = random.nextInt(9) + 7 // 7 ~ 15
         */
        while (true) {
            System.out.println("请输入你猜的数:");
            int result = scanner.nextInt();
            if (result > number) {
                System.out.println("大了");
            } else if (result < number) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜对了!");
                break;
            }
        }
    }
}
