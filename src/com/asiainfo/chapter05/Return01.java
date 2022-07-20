package com.asiainfo.chapter05;

public class Return01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i = " + i);
                // continue;
                // Hello World!
                // Hello World!
                // i = 3
                // Hello World!
                // Hello World!
                // go on...

                // break;
                // Hello World!
                // Hello World!
                // i = 3
                // go on...

                return;
                // Hello World!
                // Hello World!
                // i = 3
            }
            System.out.println("Hello World!");
        }
        System.out.println("go on..");
    }
}
