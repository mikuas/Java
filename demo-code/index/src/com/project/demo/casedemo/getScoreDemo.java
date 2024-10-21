package com.project.demo.casedemo;

import java.util.Random;

public class getScoreDemo {
    public static void main(String[] args) {
        /*
            6位评委给选手打分, 分数范围0-100
            选手的最后得分为: 去掉最高分,最低分后的四个评委的平均分
         */
        System.out.println(getScore(0, 100));
    }

    public static double getScore(int start, int end) {
        Random random = new Random();
        double[] arr = new double[6];
        double score = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(start, end);
            score += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        double max = arr[0], min = arr[0];
        for (double j : arr) {
            if (max < j) {
                max = j;
            } else if (min > j) {
                min = j;
            }
        }
        return (score - max - min) / 4;
    }
}
