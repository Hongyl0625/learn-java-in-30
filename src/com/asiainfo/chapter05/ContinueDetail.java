package com.asiainfo.chapter05;

public class ContinueDetail {
    public static void main(String[] args) {
        label1:
        for (int j = 0; j < 4; j++) {
            System.out.println("-----------");
            label2:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
//                    continue;
                    continue label1;
                }
                System.out.println("i = " + i);
            }
        }
    }
}