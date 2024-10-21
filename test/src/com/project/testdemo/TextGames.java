package com.project.testdemo;

import java.util.Random;

public class TextGames {
    private String name;
    private int bloodVolume;

    public TextGames() {

    }

    public TextGames(String name, int bloodVolume) {
        this.bloodVolume = bloodVolume;
        this.name = name;
    }

    public int getBloodVolume() {
        return bloodVolume;
    }

    public TextGames setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
        return this;
    }

    public String getName() {
        return name;
    }

    public TextGames setName(String name) {
        this.name = name;
        return this;
    }

    public void run(TextGames obj) {
        Random random = new Random();
        int result = random.nextInt(1, 21);
        if (obj.getBloodVolume() >= result) {
            obj.setBloodVolume(obj.getBloodVolume() - result);
        } else {
            obj.setBloodVolume(0);
        }
        System.out.println(this.name + "攻击了" + obj.getName() + ", 伤害: " + result + " " + obj.getName() + "剩余血量: " + obj.getBloodVolume());
    }
}
