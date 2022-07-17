package com.asiainfo.chapter05;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
            // 1 2 3 4
            //   3 4 5

            // i = 3
            // i = 4
            // i = 5
        }
    }
}
