package com.project.demo;

public class maxHeight {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        System.out.println(height1 > height2 ? height1 > height3 ? height1 : height3 : height2 > height3 ? height2 : height3);
    }
}
