package com.project.demo.studentsystemdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DEL_STUDENT_BY_ID = "2";
    private static final String REVISE_STUDENT_BY_ID = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT_LOGIN = "5";

    public static void studentManagerPage(ArrayList<Student> studentList) {
        loop: while (true) {
            System.out.println("----------欢迎来到MIKU学生管理系统----------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 返回登录界面");
            System.out.println("请输入您的选择: ");
            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case ADD_STUDENT -> addStudent(studentList);
                case DEL_STUDENT_BY_ID -> delStudentById(studentList);
                case REVISE_STUDENT_BY_ID -> reviseStudentById(studentList);
                case QUERY_STUDENT -> queryStudent(studentList);
                case EXIT_LOGIN -> {break loop;}
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void addStudent(ArrayList<Student> studentList) {
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生ID: ");
            String id = sc.next();
            if (contains(studentList, id)) {
                System.out.println("学生ID已存在");
                continue;
            }
            System.out.println("请输入学生姓名: ");
            String name = sc.next();
            System.out.println("请输入学生年龄: ");
            int age = sc.nextInt();
            System.out.println("请输入家庭住址: ");
            String address = sc.next();

            Student student = new Student(id, name, age, address);
            studentList.add(student);
            break;
        }
    }

    public static void delStudentById(ArrayList<Student> studentList) {
        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生ID: ");
            String id = sc.next();
            if (!contains(studentList, id)) {
                System.out.println("id不存在");
                continue;
            }
            studentList.remove(getIndexById(studentList, id));
            System.out.println("删除成功");
            break;
        }
    }

    public static void reviseStudentById(ArrayList<Student> studentList) {
        System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入修改学生的ID: ");
            String id = sc.next();
            if (!contains(studentList, id)) {
                System.out.println("id不存在");
                continue;
            }
            System.out.println("1: 修改姓名");
            System.out.println("2: 修改年龄");
            System.out.println("3: 修改家庭住址");
            System.out.println("请输入您的选择: ");
            switch (sc.next()) {
                case "1" -> {
                    System.out.println("请输入新的新姓名: ");
                    studentList.get(getIndexById(studentList, id)).setName(sc.next());
                    System.out.println("修改成功");
                    return;
                }
                case "2" -> {
                    System.out.println("请输入新的年龄: ");
                    studentList.get(getIndexById(studentList, id)).setAge(sc.nextInt());
                    System.out.println("修改成功");
                    return;
                }
                case "3" -> {
                    System.out.println("请输入新的家庭住址: ");
                    studentList.get(getIndexById(studentList, id)).setAddress(sc.next());
                    System.out.println("修改成功");
                    return;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void queryStudent(ArrayList<Student> studentList) {
        System.out.println("查询学生");
        if (studentList.isEmpty()) {
            System.out.println("当前暂无学生信息,请添加学生后重试");
            return;
        }
        System.out.println("ID" + "\t\t" +"姓名" + "\t\t" +"年龄" + "\t\t" +"家庭住址");
        for (Student student : studentList) {
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t\t" + student.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> studentList, String element) {
        for (Student student : studentList) {
            if (student.getId().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndexById(ArrayList<Student> studentList, String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
