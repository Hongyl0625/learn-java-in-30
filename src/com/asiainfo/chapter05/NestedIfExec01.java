package com.asiainfo.chapter05;

import java.util.Scanner;

public class NestedIfExec01 {
    public static void main(String[] args) {
        // 分析：
        // 1.新建一个Scanner，录入月份；
        // 2.判断淡季旺季；
        // 3.输入顾客的年龄。
        // 4.根据年龄判断其输出的票价

        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入当前月份：");
        int month = myScanner.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("请输入顾客的年龄：");
            if (month >= 4 && month <= 10) {
                // 旺季

                int age = myScanner.nextInt();

                if (age > 0) {
                    if (age >= 18 && age <= 60) {
                        System.out.println("您的票价为60元");
                    } else if (age < 18) {
                        System.out.println("您的票价为30元");
                    } else {
                        System.out.println("您的票价为20元");
                    }
                } else {
                    System.out.println("年龄输入不合法，请重新输入");
                }

            } else {
                // 淡季
                int age = myScanner.nextInt();

                if (age > 0) {
                    if (age >= 18) {
                        System.out.println("您的票价为30元");
                    } else {
                        System.out.println("您的票价为20元");
                    }
                } else {
                    System.out.println("请输入合法的年龄");
                }
            }
        } else {
            System.out.println("请输入合法的月份");
        }
    }
}
