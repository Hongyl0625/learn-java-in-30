package com.asiainfo.chapter05;

import java.util.Scanner;

/**
 * 2、实现判断一个整数，属于哪个范围：大于0；小于0；等于0
 */
public class ControlStructureExecise02 {
    public static void main(String[] args) {
        /*
    思路解析：
        1、输入一个整数。
        2、利用if else来判断它的范围
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = scanner.nextInt();
        if (i > 0) {
            System.out.println(i + "大于0");
        } else if (i < 0) {
            System.out.println(i + "小于0");
        } else {
            System.out.println(i + "等于0");
        }
    }
}
