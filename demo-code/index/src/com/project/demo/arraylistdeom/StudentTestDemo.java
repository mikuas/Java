package com.project.demo.arraylistdeom;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestDemo {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ids = new ArrayList<>();
        for (int i = 0; i < 3;) {
            User user = new User();
            System.out.println("请输入id: ");
            String id = scanner.next();
            if (contains(id, ids)) {
                System.out.println("id不唯一,请重新输入: ");
            } else {
                ids.add(id);
                System.out.println("请输入姓名: ");
                String name = scanner.next();
                System.out.println("请输入密码: ");
                String password = scanner.next();
                user.setId(id).setUserName(name).setPassword(password);
                userList.add(user);
                i++;
            }
        }

        System.out.println(searchUserInfoById(userList, "114514"));
        System.out.println(getIndexById(userList, "114515"));
    }

    public static String searchUserInfoById(ArrayList<User> userList, String id) {
        for (User user : userList) {
            if (id.equals(user.getId())) {
                return "ID: " + user.getId() + ", UserName: " + user.getUserName() + ", Password: " + user.getPassword();
            }
        }
        return null;
    }

    public static int getIndexById( ArrayList<User> array, String id) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String arg, ArrayList<String> array) {
        for (String element : array) {
            if (element.equals(arg)) {
                return true;
            }
        }
        return false;
    }
}
