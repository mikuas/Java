package ArrayListDemo.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<PasswordManagerSystem> passwordList = new ArrayList<>();
        PasswordManagerSystem password = new PasswordManagerSystem();

        password.setUserName("teacher").setPassword("114514").setIdCardNumber("1145141919810").setPhoneNumber("1919810");
        passwordList.add(password);

        loop: while (true) {
            switch (mainPage()) {
                case "1" -> {
                    manager: if (userLogin(passwordList)) {
                        while (true) {
                            switch (managerPage()) {
                                case "1" -> addStudent(studentList);
                                case "2" -> System.out.println(delStudent(studentList));
                                case "3" -> reviseStudent(studentList);
                                case "4" -> queryStudentInfo(studentList);
                                case "5" -> {
                                    System.out.println("已退出登录");
                                    break manager;
                                } // System.exit(0); 停止虚拟机运行
                                default -> System.out.println("没有这个选项");
                            }
                        }
                    } else {
                        System.out.println("登录失败,用户名或密码错误");
                    }
                }
                case "2" -> userRegistered(passwordList);
                case "3" -> resetPassword(passwordList);
                case "4" -> {break loop;}
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static String mainPage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作");
        System.out.println("1: 登录");
        System.out.println("2: 注册");
        System.out.println("3: 忘记密码");
        System.out.println("4: 退出");
        return sc.next();
    }

    public static String managerPage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------欢迎来到MIKU学生管理系统----------");
        System.out.println("1: 添加学生");
        System.out.println("2: 删除学生");
        System.out.println("3: 修改学生");
        System.out.println("4: 查询学生");
        System.out.println("5: 返回登录界面");
        System.out.println("请输入您的选择: ");
        return sc.next();
    }

    public static boolean userLogin(ArrayList<PasswordManagerSystem> passwordList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String name = sc.next();
        System.out.println("请输入密码: ");
        String password = sc.next();
        return verifyPassword(name, password, passwordList);
    }

    public static void userRegistered(ArrayList<PasswordManagerSystem> passwordList) {
        Scanner sc = new Scanner(System.in);
        PasswordManagerSystem user = new PasswordManagerSystem();
        while (true) {
            System.out.println("请输入要创建的用户名: ");
            String name = sc.next();
             if (containsName(name, passwordList)) {
                 System.out.println("用户已存在, 请重新输入");
             } else if (verifyUserName(name) && name.length() >= 3 && name.length() <= 15) {
                System.out.println("不能以纯数字命名,长度3-15位");
             } else {
                System.out.println("请设置密码: ");
                String password = sc.next();
                System.out.println("请再次输入密码: ");
                String token = sc.next();
                if (password.equals(token)) {
                    System.out.println("请输入身份证号码: ");
                    String idCard = sc.next();
                    if (idCard.charAt(0) == '0') {
                        System.out.println("身份证不能以0开头");
                    } else if (verifyIdCardNumber(idCard)) {
                        System.out.println("身份证有误格式有误");
                    }
                    else {
                        System.out.println("请输入手机号码: ");
                        String phone = sc.next();
                        if (phone.charAt(0) == '0') {
                            System.out.println("手机号不能以0开头");
                        } else if (verifyPhoneNumber(phone)) {
                            user.setUserName(name).setPassword(password).setIdCardNumber(idCard).setPhoneNumber(phone);
                            passwordList.add(user);
                            System.out.println("创建成功");
                            break;
                        } else {
                            System.out.println("手机号格式错误");
                        }
                    }
                } else {
                    System.out.println("输入的密码不一致");
                }
            }
        }
    }

    public static void resetPassword(ArrayList<PasswordManagerSystem> passwordList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要重置密码的用户: ");
        String user = sc.next();
        if (containsName(user, passwordList)) {
            System.out.println("请输入身份证号码: ");
            String idCard = sc.next();
            if (containsIdCardNumber(passwordList, idCard)) {
                System.out.println("请输入新的密码: ");
                String passwd = sc.next();
                System.out.println("请再次输入密码: ");
                String token = sc.next();
                if (passwd.equals(token)) {
                    passwordList.get(getIndexByName(passwordList, user)).setPassword(passwd);
                    System.out.println("修改成功");
                } else {
                    System.out.println("输入的密码不一致");
                }
            } else {
                System.out.println("身份证号码错误");
            }
        } else {
            System.out.println("用户不存在");
        }
    }

    public static void addStudent(ArrayList<Student> studentList) {
        System.out.println("添加学生");
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id: ");
            String id = sc.next();
            if (containsId(id, studentList)) {
                System.out.println("id不唯一,请重新输入: ");
            } else {
                System.out.println("请输入学生姓名: ");
                String name = sc.next();

                System.out.println("请输入学生年龄: ");
                int age = sc.nextInt();

                System.out.println("请输入学生性别: ");
                String gender = sc.next();

                student.setId(id).setName(name).setAge(age).setGender(gender);

                studentList.add(student);
                System.out.println("添加成功");
                break;
            }
        }
    }

    public static String delStudent(ArrayList<Student> studentList) {
        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id: ");
        String id = sc.next();
        if (containsId(id, studentList)) {
//            studentList.removeIf(student -> student.getId().equals(id));
            studentList.remove(getIndexById(studentList, id));
            return "删除成功";
        }
        return "删除失败,id不存在";
    }

    public static void reviseStudent(ArrayList<Student> studentList) {
        System.out.println("修改学生");
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
        System.out.println("查询学生");
        if (studentList.isEmpty()) {
            System.out.println("当前无学生信息,请添加后查看");
            return;
        }
        System.out.println("id" + "\t\t" + "name" + "\t\t" + "age" + "\t\t" + "gender");
        for (Student student : studentList) {
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getGender());
        }
    }

    public static boolean containsId(String id, ArrayList<Student> studentList) {
        return getIndexById(studentList, id) >= 0;
    }

    public static int getIndexById(ArrayList<Student> studentList, String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean containsName(String userName, ArrayList<PasswordManagerSystem> passwordList) {
        return getIndexByName(passwordList, userName) >= 0;
    }

    public static int getIndexByName(ArrayList<PasswordManagerSystem> passwordList, String name) {
        for (int i = 0; i < passwordList.size(); i++) {
            if (passwordList.get(i).getUserName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean containsIdCardNumber(ArrayList<PasswordManagerSystem> passwordList, String idCardNumber) {
        return getIndexByIdCard(passwordList, idCardNumber) >= 0;
    }

    public static int getIndexByIdCard(ArrayList<PasswordManagerSystem> passwordList, String name) {
        for (int i = 0; i < passwordList.size(); i++) {
            if (passwordList.get(i).getIdCardNumber().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean verifyPassword(String userName, String password, ArrayList<PasswordManagerSystem> passwordList) {
        if (containsName(userName, passwordList)) {
            return passwordList.get(getIndexByName(passwordList, userName)).getPassword().equals(password);
        }
        return false;
    }

    public static boolean verifyUserName(String element) {
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int len = 0;
        for (int i = 0; i < element.length(); i++) {
            for (char ca : chars) {
                if (element.charAt(i) == ca) {
                    len++;
                }
            }
        }
        return len == element.length();
    }

    public static boolean verifyIdCardNumber(String idCard) {
        if (idCard.length() != 18) {
            return true;
        }
        String end = idCard.substring(17);
        System.out.println(end);
        System.out.println(idCard.substring(0, idCard.length() - 1));
        return !(verifyUserName(idCard.substring(0, idCard.length()- 1)) && (end.equals("x") || end.equals("X") || verifyUserName(end)));
    }

    public static boolean verifyPhoneNumber(String phoneNumber) {
        return verifyUserName(phoneNumber) && phoneNumber.length() == 11 && phoneNumber.charAt(0) != '0';
    }
}
