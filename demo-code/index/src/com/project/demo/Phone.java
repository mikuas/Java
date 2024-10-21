package com.project.demo;

import java.util.Random;

public class Phone {
    String brand;
    double price;

    public void call() {
        System.out.println("Call");
    }

    public void playGame() {
        System.out.println("给木");
    }

    public int getRandom(int start, int end) {
        Random random = new Random();
        return random.nextInt(start, end + 1);
    }
}
