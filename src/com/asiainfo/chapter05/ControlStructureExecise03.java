package com.asiainfo.chapter05;

import java.util.Scanner;

/**
 * 3、判断一个年份是否未闰年
 */
public class ControlStructureExecise03 {
    public static void main(String[] args) {
        /*
        思路解析：
            1、输入一个年份
            2、两种条件则概念为闰年：a、能被4整除，但是不能被100整除的年份；b、能被400整除的年份
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个年份:");
            int year = scanner.nextInt();
            if (year <= 0) {
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year+"是闰年");
            } else if (year % 400 == 0) {
                System.out.println(year+"是闰年");
            } else {
                System.out.println(year+"不是闰年");
            }
            return;
        }
    }
}
