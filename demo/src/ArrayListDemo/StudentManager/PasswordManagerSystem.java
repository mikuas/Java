package ArrayListDemo.StudentManager;

public class PasswordManagerSystem {
    private String userName;
    private String password;
    private String idCardNumber;
    private String phoneNumber;

    public PasswordManagerSystem() {

    }

    public PasswordManagerSystem(String userName, String password, String idCardNumber, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public PasswordManagerSystem setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PasswordManagerSystem setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public PasswordManagerSystem setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PasswordManagerSystem setPassword(String password) {
        this.password = password;
        return this;
    }
}
