package com.project.testdemo;

public class TestArrTest {
    public static void main(String[] args) {
        TestArr[] arr = new TestArr[3];

        TestArr t1 = new TestArr("0d00", "HUAWEI", 5999.9, 100);
        TestArr t2 = new TestArr("0d01", "FLYs", 599.9, 100);
        TestArr t3 = new TestArr("0d02", "Mouse", 59.9, 100);

        arr[0] = t1;
        arr[1] = t2;
        arr[2] = t3;
        for (TestArr testArr : arr) {
            System.out.println(testArr.getName());
            System.out.println(testArr.getId());
            System.out.println(testArr.getPrice());
            System.out.println(testArr.getCount());
            System.out.println("-------------------");
        }
    }
}
