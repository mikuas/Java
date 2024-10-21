package com.project.demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建集合的对象
        // 泛型 限定集合中存储数据的类型
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        // 打印的不是地址值,而是集合中存储数据内容
        System.out.println(list);
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);

        // 删除指定元素
        list.remove("A");
        System.out.println(list);

        // 删除指定索引元素
        list.remove(0);
        System.out.println(list);
        list.add("E");
        list.add("F");
        list.set(1, "G");
        System.out.println(list);
        String result = list.get(list.size() - 1);
        System.out.println(result);

    }
}
