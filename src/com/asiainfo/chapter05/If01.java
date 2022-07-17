package com.asiainfo.chapter05;

import java.util.Scanner;

public class If01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的年龄：");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("您的年龄大于18，要对自己的行为负责，送入监狱");
        }
        System.out.println("程序继续执行");
    }
}
