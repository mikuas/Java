package com.project.demo.casedemo;

public class test1_1 {
    public static void main(String[] args) {
        /*
            数字加密
            得到每一位数,然后每一位数都加上5, 再对10求余, 最后将所有数字反转, 得到一串新数.
         */
        test(1234567891011121314L);
    }

    public static long getPasswd(long password) {
        long result = 0;
        while (password > 0) {
            if ((password - 5) % 10 % 5 == 0) {
                password /= 10;
                result = result * 10 + 5;
                continue;
            }
            long ge = password % 10;
            password /= 10;
            result = result * 10 + (ge + 5) % 10;
        }
        return result;
    }

    public static void test(long password) {
        System.out.println(getPasswd(password));
        System.out.println(getPasswd(getPasswd(password)));
    }

}
