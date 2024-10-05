package index;

public class StringDemo4 {
    public static void main(String[] args) {
        String strA = "Hello World";
        String strB = "dlroW olleH";

        System.out.println(strA);
    }

    public static String moveString(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.toString();
    }
}
