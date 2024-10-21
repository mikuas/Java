package com.project.demo;

public class createMethodDemo {
    public static void main(String[] args) {
        playGame();
        calc(100, 200);
    }

    public static void playGame() {
        System.out.println("START GAME");
        System.out.println("RUN");
        System.out.println("GOGO");
        System.out.println("GAME OVER");
    }

    public static void calc(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
