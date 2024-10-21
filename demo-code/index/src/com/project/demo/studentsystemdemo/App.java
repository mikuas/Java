package com.project.demo.studentsystemdemo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import com.project.demo.objdemo.stringcasedemo.StringDemo2;

public class App {
    static ArrayList<User> userList = new ArrayList<>();
    static ArrayList<Student> studentList = new ArrayList<>();
    static {
        User user = new User("admin", "114514", "1145141919810", "1919810");
        userList.add(user);
    }

    private static final String USER_LOGIN = "1";
    private static final String USER_REGISTERED = "2";
    private static final String RESET_PASSWORD = "3";
    private static final String EXIT_SYSTEM = "4";

    public static void main(String[] args) {
        mainPage(userList, studentList);
    }

    public static void mainPage(ArrayList<User> userList, ArrayList<Student> studentList) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1: 登录");
            System.out.println("2: 注册");
            System.out.println("3: 忘记密码");
            System.out.println("4: 退出系统");
            System.out.println("请输入您的选择: ");
            switch (sc.next()) {
                case USER_LOGIN -> {
                    if (userLogin(userList)) {
                        System.out.println("登录成功");
                        StudentSystem.studentManagerPage(studentList);
                    } else {
                        System.out.println("用户名或密码错误");
                    }
                }
                case USER_REGISTERED -> userRegistered(userList);
                case RESET_PASSWORD -> resetPassword(userList);
                case EXIT_SYSTEM -> {
                    System.exit(0);
                    System.out.println("感谢您的使用,再见!");
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static boolean userLogin(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("登录");
        while (true) {
            System.out.println("请输入用户名: ");
            String name = sc.next();
            if (!contains(userList, name)) {
                System.out.println("用户不存在(未注册)");
                continue;
            }
            String code = getCaptcha();
            System.out.println("验证码: " + code);
            System.out.println("请输入验证码: ");
            String num = sc.next();
            // 验证码忽略大小写
            if (!code.equalsIgnoreCase(num)) {
                System.out.println("验证码错误");
                continue;
            }
            System.out.println("请输入密码: ");
            String password = sc.next();
            return userList.get(getIndexByName(userList, name)).getPassword().equals(password);
        }
    }

    public static void userRegistered(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("注册");
        String userName;
        String password;
        String idCardNumber;
        String phoneNumber;
        while (true) {
            System.out.println("请输入用户名: ");
            String name = sc.next();
            if (contains(userList, name)) {
                System.out.println("用户已存在");
                continue;
            }
            if (checkUserName(name)) {
                userName = name;
                break;
            } else {
                System.out.println("用户名格式错误");
            }
        }

        while (true) {
            System.out.println("请输入密码: ");
            String p1 = sc.next();
            System.out.println("请再次输入密码: ");
            String p2 = sc.next();
            if (p1.equals(p2)) {
                password = p1;
                break;
            } else {
                System.out.println("两次输入的密码不一致,请重新输入");
            }
        }

        while (true) {
            System.out.println("请输入身份证: ");
            String id = sc.next();
            if (checkIdCardNumber(id)) {
                idCardNumber = id;
                break;
            } else {
                System.out.println("身份证号码格式错误");
            }
        }

        while (true) {
            System.out.println("请输入手机号码: ");
            String phone = sc.next();
            if (checkPhoneNumber(phone)) {
                phoneNumber = phone;
                break;
            } else {
                System.out.println("手机号格式错误");
            }
        }

        System.out.println("注册成功!");
        User user = new User(userName, password, idCardNumber, phoneNumber);
        userList.add(user);
    }

    public static void resetPassword(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("重置密码");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名: ");
            String name = sc.next();
            if (!contains(userList, name)) {
                System.out.println("用户名不存在(未注册)");
                continue;
            }
            System.out.println("请输入身份证号码: ");
            String id = sc.next();
            if (!verifyIdCardNumber(userList, id)) {
                System.out.println("身份证号码不匹配");
                continue;
            }
            System.out.println("请输入手机号码");
            String phone = sc.next();
            if (!verifyPhoneNumber(userList, phone)) {
                System.out.println("手机号码不匹配");
                continue;
            }
            System.out.println("请输入新的密码: ");
            String newPassword = sc.next();
            System.out.println("请再次输入密码: ");
            String checkPassword = sc.next();
            if (newPassword.equals(checkPassword)) {
                System.out.println("修改成功");
                userList.get(getIndexByName(userList, name)).setPassword(newPassword);
                return;
            }
            System.out.println("密码不匹配,修改失败");
        }
    }

    public static boolean checkUserName(String userName) {
        if (userName.length() < 3 || userName.length() > 15) {
            return false;
        }

        for (int i = 0; i < userName.length(); i++) {
            char ch = userName.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                return false;
            }
        }
        for (int i = 0; i < userName.length(); i++) {
            char ch = userName.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdCardNumber(String idCardNumber) {
        if (idCardNumber.startsWith("0")) {
            return false;
        }
        if (idCardNumber.length() != 18) {
            return false;
        }
        for (int i = 0; i < idCardNumber.length() - 1; i++) {
            char ch = idCardNumber.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')|| (ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        char end = idCardNumber.charAt(idCardNumber.length() - 1);
        return end == 'X' || end == 'x' || (end >= '0' && end <= '9');
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        if (phoneNumber.length() != 11) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static boolean verifyIdCardNumber(ArrayList<User> userList, String idCardNumber) {
        for (User user : userList) {
            if (user.getIdCardNumber().equals(idCardNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyPhoneNumber(ArrayList<User> userList, String phoneNumber) {
        for (User user : userList) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(ArrayList<User> userList, String name) {
        for (User user : userList) {
            if (user.getUserName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndexByName(ArrayList<User> userList, String password) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    public static String getCaptcha() {
        char[] result = StringDemo2.getAtoZ();
        Random random = new Random();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            code.append(result[random.nextInt(result.length)]);
        }
        String captcha = code.append(random.nextInt(10)).toString();
        char[] chars = captcha.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
            int randomIndex = random.nextInt(chars.length);
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
        return new String(chars);
    }
}


