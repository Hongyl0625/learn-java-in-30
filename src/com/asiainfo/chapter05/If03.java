package com.asiainfo.chapter05;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入芝麻信用分：");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score >= 60 && score <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("输入不合法，请重新输入:)");
        }
    }
}
