package com.project.demo.interfacedemo6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 使用lambda表达式打印每个名字
        names.forEach(name -> System.out.println(name));
    }
}
