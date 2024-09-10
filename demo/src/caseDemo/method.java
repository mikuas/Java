package caseDemo;

public class method {
    public static void main(String[] args) {

    }

    public static boolean contains(int[] array, int element) {
        for (int i : array) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    public static void printArrayElement(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTwoDimensionArrayElement(int[][] array) {
        for (int[] i : array) {
            printArrayElement(i);
        }
    }
}
