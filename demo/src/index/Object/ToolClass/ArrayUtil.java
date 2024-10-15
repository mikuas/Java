package index.Object.ToolClass;

import java.util.StringJoiner;

public class ArrayUtil {

    private ArrayUtil() {

    }

    public static String printArray(int[] array) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (Object element : array) {
            joiner.add(element.toString());
        }
        return joiner.toString();
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
