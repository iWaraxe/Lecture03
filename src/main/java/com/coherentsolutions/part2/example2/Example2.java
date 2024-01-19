package com.coherentsolutions.part2.example2;

public class Example2 {

    public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
