package com.asiainfo.chapter05;

public class NestedLoop01 {
    public static void main(String[] args) {
        // i = 0, j = 0
        // i = 0, j = 1
        // i = 0, j = 2
        // i = 1, j = 0
        // i = 1, j = 1
        // i = 1, j = 2
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
