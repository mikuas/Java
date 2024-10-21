package com.project.demo;

public class dataTypeTransitionDemo {
    public static void main(String[] args) {
        double number = 11.99;
        int a = (int) number;
        System.out.println(a);

        byte b = 100;
        byte c = 50;
        byte result = (byte)(b + c);
        System.out.println(result);

        String str = "Hello";
        int num = 1145;
        System.out.println(num + str);

//        Scanner sc = new Scanner(System.in);
//        int int_num = sc.nextInt();
//        System.out.println(int_num % 10);
//        System.out.println(int_num / 10 % 10 * 10);
//        System.out.println(int_num / 100 % 100 * 100);

        char re = 'H';
        int results = re + 'B';
        char e = 'D';
        System.out.println(results);
        System.out.println(re + e);
    }
}
