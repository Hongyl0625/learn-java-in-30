package com.asiainfo.chapter05;

public class WhileExecise {
    public static void main(String[] args) {
        System.out.println("------------第一题--------------");
        // 1.打印1-100之间所有能被3整除的数【使用while】
        // 思路
        // a.轮询1-100
        // b.判断能被3整除则打印到控制台
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("------------第二题--------------");

        // 2.打印40-200之间所有的偶数
        int j = 40;
        while (j <= 200) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
    }
}
