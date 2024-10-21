package com.project.demo.casedemo;

public class pstest {
    public static void main(String[] args) {
        test(19794616168975L);
    }

    public static long getPasswd(long password) {
        long result = 0;
        long multiplier = 1; // 用于反转数字顺序
        while (password > 0) {
            long ge = password % 10;
            ge = (ge + 5) % 10; // 每位数字加5并取模
            result += ge * multiplier;
            multiplier *= 10;
            password /= 10;
        }
        return result;
    }

    public static long getOriginPasswd(long password) {
        long result = 0;
        long multiplier = 1; // 用于反转数字顺序
        while (password > 0) {
            long ge = password % 10;
            ge = (ge + 5) % 10; // 逆向操作同样处理
            result += ge * multiplier;
            multiplier *= 10;
            password /= 10;
        }
        return result;
    }

    public static void test(long password) {
        long encrypted = getPasswd(password);
        long decrypted = getOriginPasswd(encrypted);

        System.out.println("Original: " + password);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
