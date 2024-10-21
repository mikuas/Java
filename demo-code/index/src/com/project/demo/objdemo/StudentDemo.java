package com.project.demo.objdemo;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan").setAge(24).setGender("man");
        s1.teacherName = "PM";
        Student.teacherName = "LXZ";

        Student s2 = new Student();
        s2.setName("lisi").setAge(25).setGender("woman");

        s1.show();
        s2.show();
    }
}
