package com.project.demo.objdemo.polymorphicdemo;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("LYF").setAge(40);

        Student student = new Student();
        student.setName("LJW").setAge(18);

        Administrator administrator = new Administrator();
        administrator.setName("Admin").setAge(35);

        register(teacher);
        register(student);
        register(administrator);

        Person p = new Teacher();
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            t.show();
        }

        if (p instanceof Teacher t) {
            t.show();
        }
    }

    public static void register(Person P) {
        P.show();
    }
}
