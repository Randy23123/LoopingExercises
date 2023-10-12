package com.pluralsight;

public class LoopingExercises {
    //while loop
    public static void main(String[] args) {

        int i = -50;
        int sum = 0;

        while (i >= -200){
            sum += i;
            System.out.println(sum);
            i--;
        }
        System.out.println("The sum = " + sum);
    }
}
