package com.asiainfo.chapter06;

import java.util.Scanner;

/**
 * 循环输入5个成绩，保存到double数组，并输出
 */
public class Array02 {
    public static void main(String[] args) {

        // 数组使用方法1：动态初始化
        // 数据类型[] 数组名称 = new 数据类型[数组长度]
//        double[] scoreArr = new double[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.print("请输入成绩:");
//            scoreArr[i] = scanner.nextDouble();
//        }
//        for (int i = 0; i < scoreArr.length; i++) {
//            System.out.println("第" + (i + 1) + "位同学的成绩为" + scoreArr[i]);
//        }

        // 数组使用方法2：动态初始化
        // 数据类型[] 数组名称 --> 声明数组，这时 score 是 null；
        // 数组名称 = new 数据类型[数组长度] --> 分配内存空间，可以存放数据

        double[] scoreArr2;
        scoreArr2 = new double[5];
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i < scoreArr2.length; i++) {
            System.out.print("请输入成绩:");
            scoreArr2[i] = scanner2.nextDouble();
        }
        for (int i = 0; i < scoreArr2.length; i++) {
            System.out.println("第" + (i + 1) + "位同学的成绩为" + scoreArr2[i]);
        }

        // 数组使用方法3：静态初始化
        // 数据类型[] 数组名称 = {元素值, 元素值, ...};
        double[] scoreArr3 = {2,3,5,6,7};
        for (int i = 0; i < scoreArr3.length; i++) {
            System.out.println(scoreArr3[i]);
        }
    }
}
