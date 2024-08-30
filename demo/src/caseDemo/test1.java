package caseDemo;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*
            需求: 机票按照淡季旺季,头等舱和经济舱,输入机票原价,月份和同等舱或经济舱
            按照如下规则计算机票价格: 旺季(5-10月), 头等舱9折,经济舱8.5折, 淡季(11月到来年4月), 头等舱7折,经济舱6.5折
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票的原价:");
        double price = scanner.nextInt();
        System.out.println("请输入季节:");
        int month = scanner.nextInt();
        System.out.println("请输入购买的舱位, 1 头等舱, 0 经济舱");
        int cabin = scanner.nextInt();
    }
}
