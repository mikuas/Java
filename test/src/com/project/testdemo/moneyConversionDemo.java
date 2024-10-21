package com.project.testdemo;

public class moneyConversionDemo {
    public static void main(String[] args) {
        int element = 12345;

        System.out.println(addUnit(addZero(getUppercaseNumber(element))));
    }

    public static String getUppercaseNumber(int number) {
        String[] bigString = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

        String result = "";
        while (number != 0) {
            int ge = number % 10;
            result = bigString[ge] + result;
            number /= 10;
        }
        return result;
    }

    public static String addUnit(String string) {
        String[] unit = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result += string.charAt(i) + unit[i];
        }
        return result;
    }

    public static String addZero(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.length() == 7) {
                break;
            } else {
                string = "零" + string;
            }
        }
        return string;
    }
}
