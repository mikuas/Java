package com.project.demo.casedemo;

public class setPasswdDemo {
    public static void main(String[] args) {
        /*
            数字加密
            得到每一位数,然后每一位数都加上5, 再对10求余, 最后将所有数字反转, 得到一串新数.
         */
        test(1234555556);
    }

    public static long getPasswd(long passwd) {
        long result = 0;
        long ge;
        while (passwd > 0) {
                ge = (passwd % 10 + 5) % 10;
                passwd /= 10;
                result = result * 10 + ge;
        }
        return result;
    }

    public static void test(long passwd) {
        System.out.println("加密: " + getPasswd(passwd));
        System.out.println("解密: " + getPasswd(getPasswd(passwd)));
        System.out.println(passwd == getPasswd(getPasswd(passwd)));
    }
}