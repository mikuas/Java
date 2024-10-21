package com.project.demo.casedemo;

public class countAllMoney {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        getAllMoney(arr);
    }

    public static void getAllMoney(int[][] array) {
        int sunMoney = 0;
        for (int i = 0; i < array.length; i++) {
            int money = 0;
            for (int k : array[i]) {
                money += k;
            }
            System.out.println("第" + (i + 1) + "个季度的总营业额为: " + money);
            sunMoney += money;
        }
        System.out.println("总营业额为: " + sunMoney);
    }
}
