package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(generateRandomAge());

    }

    public static int generateRandomAge() {
        int random = (int) (Math.random() * (100));
        if (random < 50 && random > 5) {
            System.out.println("Вы довольно молоды, прогулка вам не помешает");
        } else if (random <= 5) {
            System.out.println("Научитесь нормально ходить");
        }
        if (random > 50 ) {
            System.out.println("Вы слишком стары, вам лучше остатся дома");
        }
        return random;

    }


}






