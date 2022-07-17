package com.asiainfo.chapter05;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // 思路分析
        // 1.新建一个Scanner对象；
        // 2.接收成绩 double score；
        // 3.判断成绩是否可以进入决赛
        // 4.进入决赛后，接收性别；
        // 5.判断进入的性别组；
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入歌手的成绩：");
        double score = myScanner.nextDouble();
        if (score >= 8.0) {
            System.out.print("请输入歌手的性别：");
            char sex = myScanner.next().charAt(0);
            if (sex == '男') {
                System.out.println("进入男子组决赛");
            } else if (sex == '女') {
                System.out.println("进入女子组决赛");
            } else {
                System.out.println("性别输入有误，无法进入决赛");
            }
        } else {
            System.out.println("抱歉，您被淘汰了～");
        }
    }
}
