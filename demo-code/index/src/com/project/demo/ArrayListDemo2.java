package com.project.demo;

import com.project.demo.objdemo.Student;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student s = new Student();
            s.setName("name" + i);
            s.setAge(i);
            students.add(s);
        }

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
