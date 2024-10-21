package com.project.demo.objdemo.stringcasedemo;

import java.util.Random;

public class StringDemo2 {
    public static void main(String[] args) {
        /*
        生成验证码
        可以是大小写字母,数字
        长度5
        数字只有一位
         */
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        char[] a_z = getAtoZ();
        int number = random.nextInt(10);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            result.append(a_z[random.nextInt(a_z.length)]);
        }
        String captcha = result.append(random.nextInt(10)).toString();
        System.out.println(captcha);
    }

    public static char[] getAtoZ() {
        char[] result = new char[52];
        for (int i = 'A', j = 0; i <= 'z'; i++) {
            if (i > 'Z' && i < 'a') {
                continue;
            }
            result[j] = (char) i;
            j++;
        }
        return result;
    }
}
