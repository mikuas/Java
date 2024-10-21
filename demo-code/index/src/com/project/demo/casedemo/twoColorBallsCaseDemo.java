package com.project.demo.casedemo;

import com.project.demo.method;

import java.util.Random;
import java.util.Scanner;
// ctrl + alt + t

public class twoColorBallsCaseDemo {
    public static void main(String[] args) {
        int[] ballArr = new int[7];
        createRandomNumberToArray(ballArr, 1, 33);
        method.printArrayElement(ballArr);
        isArrayNumber(ballArr, getUserInput(7), 0, 0);
    }

    public static void createRandomNumberToArray(int[] array, int start, int end) {
        Random random = new Random();
        for (int i = 0; i < array.length; ) {
            int randomNumber = random.nextInt(start, end);
            if (!method.contains(array, randomNumber)) {
                array[i] = randomNumber;
                i++;
            }
        }
        array[array.length - 1] = random.nextInt(1, 17);
    }

    public static int[] getUserInput(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i = 1; i < count; ) {
            System.out.println("请输入第" + i + "个红色球号范围 1-33:");
            int element = scanner.nextInt();
            if (element >= 1 && element <= 33) {
                if (method.contains(arr, element)) {
                    System.out.println("输入重复,请从新输入!");
                } else {
                    arr[i - 1] = element;
                    i++;
                }
            } else {
                System.out.println("当前号码超出范围!");
            }
        }
        while (true) {
            System.out.println("请输入蓝球球号范围 1-16:");
            int element = scanner.nextInt();
            if (element >= 1 && element <= 16) {
                arr[count - 1] = element;
                break;
            } else {
                System.out.println("当前号码超出范围!");
            }
        }
        return arr;
    }

    public static void isArrayNumber(int[] arrayOne, int[] arrayTwo, int reaCount, int blueCount) {
        for (int i : arrayTwo) {
            for (int j = 0; j < arrayOne.length - 1; j++) {
                if (i == arrayOne[j]) {
                    reaCount++;
                }
            }
        }
        if (arrayOne[arrayOne.length - 1] == arrayTwo[arrayTwo.length - 1]) {
            blueCount++;
        }
        System.out.println("红球:" + reaCount + "个 蓝球:" + blueCount + "个");
        getPrize(reaCount, blueCount);
    }

    public static void getPrize(int readNumber, int blueNumber) {
        if ((readNumber == 0 && blueNumber == 1) || (readNumber == 1 && blueNumber == 1) || (readNumber == 2 && blueNumber == 1)) {
            System.out.println("恭喜你六等奖: 奖品5元");
        } else if ((readNumber == 3 && blueNumber == 1) || (readNumber == 4 && blueNumber == 0)) {
            System.out.println("恭喜你五等奖: 奖品10元");
        } else if ((readNumber == 5 && blueNumber == 0) || (readNumber == 4 && blueNumber == 1)) {
            System.out.println("恭喜你四等奖: 奖品200元");
        } else if ((readNumber == 5 && blueNumber == 1)) {
            System.out.println("恭喜你三等奖: 奖品3000元");
        } else if ((readNumber == 6 && blueNumber == 0)) {
            System.out.println("恭喜你二等奖: 奖品500万");
        } else if ((readNumber == 6 && blueNumber == 1)) {
            System.out.println("恭喜你一等奖: 奖品1000万元");
        } else {
            System.out.println("谢谢参与!");
        }
    }
}
