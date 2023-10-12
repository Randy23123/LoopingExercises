package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 50;
        int loop = 0;
        do {
            loop += i;
            i++;
            System.out.println(loop);
        }
        while (i <= 200);
        System.out.println("Answer = " + loop);
    }
}
