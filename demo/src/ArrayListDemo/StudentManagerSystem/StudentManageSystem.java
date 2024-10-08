package ArrayListDemo.StudentManagerSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<String> aUid = new ArrayList<>();
//        while (true) {
        boolean flag = true;
        while (flag) {
//            int select = mainPage();
//            if (select == 1) {
//                addStudent(aUid, studentList);
//            } else if (select == 2) {
//                System.out.println(delStudent(aUid, studentList));
//            } else if (select == 3) {
//                reviseStudent(studentList);
//            } else if (select == 4) {
//                queryStudentInfo(studentList);
//            } else if (select == 5) {
//                break;
//            }
            switch (mainPage()) {
                case 1 -> addStudent(aUid, studentList);
                case 2 -> System.out.println(delStudent(aUid, studentList));
                case 3 -> reviseStudent(studentList);
                case 4 -> queryStudentInfo(studentList);
                case 5 -> flag = false;
            }
        }
    }

    public static int mainPage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------欢迎来到MIKU学生管理系统----------");
        System.out.println("1: 添加学生");
        System.out.println("2: 删除学生");
        System.out.println("3: 修改学生");
        System.out.println("4: 查询学生");
        System.out.println("5: 退出");
        System.out.println("请输入您的选择: ");
        return sc.nextInt();
    }

    public static void addStudent(ArrayList<String> uidList, ArrayList<Student> studentList) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入id: ");
            String id = sc.next();
            if (contains(id, uidList)) {
                System.out.println("id不唯一,请重新输入: ");
            } else {
                System.out.println("请输入姓名: ");
                String name = sc.next();
                System.out.println("请输入年龄: ");
                int age = sc.nextInt();
                System.out.println("请输入性别: ");
                String gender = sc.next();
                student.setId(id).setName(name).setAge(age).setGender(gender);
                uidList.add(id);
                studentList.add(student);
                break;
            }
        }
    }

    public static String delStudent(ArrayList<String> uidList, ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id: ");
        String id = sc.next();
        if (contains(id, uidList)) {
//            studentList.removeIf(student -> student.getId().equals(id));
            for (Student student : studentList) {
                if (student.getId().equals(id)) {
                    studentList.remove(student);
                }
            }
            return "删除成功";
        }
        return "删除失败,id不存在";
    }

    public static void reviseStudent(ArrayList<Student> studentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的id: ");
        String uid = sc.next();
            if (getIndexById(studentList, uid) >= 0) {
                System.out.println("1: 修改姓名");
                System.out.println("2: 修改年龄");
                System.out.println("3: 修改性别");
                System.out.println("请输入您的选择: ");
                int select = sc.nextInt();
                Student student = studentList.get(getIndexById(studentList, uid));
                if (select == 1) {
                    System.out.println("请输入新的姓名: ");
                    student.setName(sc.next());
                } else if (select == 2) {
                    System.out.println("请输入新的年龄: ");
                    student.setAge(sc.nextInt());
                } else if (select == 3) {
                    System.out.println("请输入新的性别: ");
                    student.setGender(sc.next());
                }
            } else {
                System.out.println("id不存在");
            }
    }

    public static void queryStudentInfo(ArrayList<Student> studentList) {
        System.out.println("id" + "\t\t" + "name" + "\t" + "age" + "\t\t" + "gender");
        for (Student student : studentList) {
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t\t" + student.getGender());
        }
    }

    public static boolean contains(String uid, ArrayList<String> array) {
        for (String element : array) {
            if (element.equals(uid)) {
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
