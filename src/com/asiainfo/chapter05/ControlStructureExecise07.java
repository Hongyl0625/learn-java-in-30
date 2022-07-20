package com.asiainfo.chapter05;

/**
 * 输出小写的a-z以及大写的A-Z
 */
public class ControlStructureExecise07 {
    public static void main(String[] args) {
        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
    }
}
