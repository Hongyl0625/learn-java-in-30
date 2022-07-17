package com.asiainfo.chapter05;

public class DoExecise01 {
    public static void main(String[] args) {
        // 统计1-200之间能被5整除但不能被3整除的个数

        int i = 1;
        int sum = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                sum++;
            }
            i++;
        } while (i <= 200);
        System.out.println("sum = " + sum);
    }
}
