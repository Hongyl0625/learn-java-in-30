package com.asiainfo.chapter05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        // 思路解析：
        // 1、新建一个scanner对象用于接收一个字符；
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a-g的字符:");
        char c = scanner.next().charAt(0);

        // a表示星期一，b表示星期二...根据输入现实相应的信息
        switch (c) {
            case 'a' :
                System.out.println("星期一");
                break;
            case 'b' :
                System.out.println("星期二");
                break;
            case 'c' :
                System.out.println("星期三");
                break;
            case 'd' :
                System.out.println("星期四");
                break;
            case 'e' :
                System.out.println("星期五");
                break;
            case 'f' :
                System.out.println("星期六");
                break;
            case 'g' :
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误，请输入a-g中的任意一个字符");
        }

        System.out.println("继续执行程序");
    }
}
