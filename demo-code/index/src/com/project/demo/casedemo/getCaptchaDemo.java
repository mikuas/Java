package com.project.demo.casedemo;

import java.util.Random;

public class getCaptchaDemo {
    public static void main(String[] args) {
        /*
            定义方法实现随机产生一个5位的验证码
            格式: 长5 前四位是大写字母或者小写字母
            最后一位是数字
         */
//        for (int i = 0; i < getA_z(65, 122).length; i++) {
//            System.out.println(getA_z(65, 122)[i]);
//        }
        System.out.println(getCaptcha(getA_z('A', 'z')));

    }//65 - 122

    public static char[] getA_z(int start, int end) {
        char[] arr = new char[52];
        for (int i = start, j = 0; i <= end; i++) {
            if (i > 'Z' && i < 'a') {
                continue;
            }
//            System.out.println(str);
            arr[j] = (char) i;
            j++;
        }

        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
        return arr;
    }

    public static String getCaptcha(char[] array) {
        Random random = new Random();
        String captcha = "";
//        while (captcha.length() < 4) {
//            captcha += array[random.nextInt(array.length)];
//        }
        for (int i = 0; i < 4; i++) {
            captcha += array[random.nextInt(array.length)];
        }
        captcha += random.nextInt(10);
        return captcha;
    }
}
