package com.project.demo.objdemo.dogesdemo;

public class ChineseDog extends Dog{
    public static void main(String[] args) {
        ChineseDog chinDog = new ChineseDog();
        chinDog.eat();
        chinDog.drink();
        chinDog.lookHome();
    }

    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
