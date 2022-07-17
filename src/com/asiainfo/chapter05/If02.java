package com.asiainfo.chapter05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        // 1.年龄输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的年龄：");
        int age = scanner.nextInt();
        // 2.大于18，则输出"你年龄大于18，要对自己的行为负责，送入监狱"
        if (age > 18) {
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
        } else {
            // 3.否则输出"你的年龄不大，这次放过你了"
            System.out.println("你的年龄不大，这次放过你了");
        }

    }
}
