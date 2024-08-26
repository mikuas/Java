package index;

public class variable {
    public static void main(String[] args) {
        int a = 114514;
        double b = 11.45;

        System.out.println(a + b);

        int number = 200; // 0000 0000 0000 0000 0000 0000 1100 1000
        byte bit = (byte) number; // 1100 1000 -> 1011 1000(原码)
        System.out.println(bit);


    }
}

