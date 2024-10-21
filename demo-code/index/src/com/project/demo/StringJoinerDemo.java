package com.project.demo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("1").add("2").add("3").add("4");
        System.out.println(sj);
    }
}
