package Test;

import java.lang.reflect.GenericArrayType;

public class User {
    // 属性
    private String userName, password, email, gender;
    private int age;

    public User() {

    }

    public User(String userName, int age, String password, String email, String gender) {
        this.userName = userName;
        this.age = age;
        this.password = password;
        this.email = email;
        this.gender = gender;
    }
    //快捷键 alt + insert

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /////////////////////////

    public String userName() {
        return userName;
    }

    public String password() {
        return password;
    }

    public String email() {
        return email;
    }

    public String gender() {
        return gender;
    }

    public int age() {
        return age;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    public String toString() {
        return "User{userName = " + userName + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }
}
