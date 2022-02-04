package com.company;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Give a number : ");
        Scanner sc = new Scanner(System.in); //console

        int headCount = 0;
        int tailCount = 0;

        int count = sc.nextInt(); // 5
        System.out.println("============== flip coin ==============");

        for (int i = 0; i < count; i++) {
            double random = Math.random();// 0 to <1
            if (random < 0.5)
                tailCount++;
            else
                headCount++;
        }


        System.out.println("percentage of tails (" + tailCount + "): " + (tailCount * 100.0 / (headCount + tailCount))); // 5.5 , 5. 0.8 -> 0
        System.out.println("percentage of heads (" + headCount + "):  " + (headCount * 100.0 / (headCount + tailCount)));
    }
}