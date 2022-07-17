package com.asiainfo.chapter05;

public class For01 {
    public static void main(String[] args) {

        // 1、需求 打印10遍 你好，韩顺平教育！

        // 2、传统做法是什么
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");
//        System.out.println("你好，韩顺平教育！");

        // 3、引入新语法：for循环控制
        //  int i = 1; 循环变量初始化
        for (int i = 1; i <= 10; i++) {
            System.out.println("你好，韩顺平教育！");
        }
    }
}
