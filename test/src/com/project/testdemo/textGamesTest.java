package com.project.testdemo;

public class textGamesTest {
    public static void main(String[] args) {
        TextGames gameOne = new TextGames("KiYaNa", 100);
        TextGames gameTwo = new TextGames("YaYi", 100);

        while (true) {
            gameOne.run(gameTwo);
            if (gameTwo.getBloodVolume() == 0) {
                System.out.println(gameOne.getName() + " K.O了 " + gameTwo.getName());
                break;
            }

            gameTwo.run(gameOne);
            if (gameOne.getBloodVolume() == 0) {
                System.out.println(gameTwo.getName() + " K.O了 " + gameOne.getName());
                break;
            }
        }
    }
}
