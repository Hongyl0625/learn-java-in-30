package com.asiainfo.chapter05;

import javax.xml.transform.Result;
import java.util.Scanner;

/**
 * 判断一个整数是否为水仙花数，所谓水仙花数是指一个三位数，其各个位上的数字立方之和等于其本身。例如153 = 1*1*1+3*3*3+5*5*5
 */
public class ControlStructureExecise04 {
    public static void main(String[] args) {
        /*
        思路解析：
            1、输入一个数值；
            2、获取到它每一位上的数值。
            3、获取立方之和，结果用于判断是否为水仙花数
         */
//        System.out.println("请输入一个3位数字：");
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        while (i < 100 || i > 999) {
//            System.out.println("输入有误，请重新输入");
//            System.out.println("请输入一个3位数字：");
//            i = scanner.nextInt();
//        }
//        int b = i / 100;
//        System.out.println(b);
//        int s = i / 10 % 10;
//        System.out.println(s);
//        int g = i % 100 % 10;
//        System.out.println(g);
//
//        int m = b * b * b + s * s * s + g * g * g;
//        System.out.println(m);
//
//        if (i == m) {
//            System.out.println(i + "是水仙花数");
//        } else {
//            System.out.println(i + "不是水仙花数");
//        }

        for (int j = 100; j < 1000; j++) {
            int b = j / 100;
            int s = j / 10 % 10;
            int g = j % 100 % 10;

            int m = b * b * b + s * s * s + g * g * g;

            if (j == m) {
                System.out.println(j + "是水仙花数");
            }
        }
    }
}
