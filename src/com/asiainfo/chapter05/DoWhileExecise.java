package com.asiainfo.chapter05;

public class DoWhileExecise {
    public static void main(String[] args) {
        // 1.打印1-100
        System.out.println("=====第一题=====");
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 100);

        System.out.println("=====第二题=====");
        // 2.计算1-100的和
        int j = 1;
        int count = 0;
        do {
            count += j;
            j++;
        } while (j <= 100);
        System.out.println(count);
    }
}
