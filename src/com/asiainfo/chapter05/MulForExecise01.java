package com.asiainfo.chapter05;

import java.util.Scanner;

public class MulForExecise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.统计3个班成绩情况，每个班有5个同学，求出各个班的平均分和所有班级的平均分

        // 思路分析：
        // 1.一次轮询输入每个班同学，并输入成绩；
        // 2.班级每位同学输入完后，计算出班级平均分；
        // 3.年级轮询完后，计算出年级平均分；
        int gradeScore = 0;
        for (int i = 1; i <= 3; i++) {
            int classScore = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("请输入" + i + "班" + j + "号同学的成绩：");
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    do {
                        System.out.print("输入有误，请输入" + i + "班" + j + "号同学的成绩：");
                        score = scanner.nextInt();
                    } while (score < 0 || score > 100);
                }
                classScore += score;
                gradeScore += score;
            }
            System.out.println(i + "班平均成绩为：" + classScore / 5);
        }
        System.out.println("年级平均成绩为：" + gradeScore / 15);


        // 统计三个班及格人数，每个班5名同学

        // 思路分析：
        // 1.轮询输入所有同学的成绩；
        // 2.每输入一个同学的成绩，首先判断是否合法，然后判断其是否及格
        // 3.有一个同学及格，统计量上就加一。

//        int sum = 0;
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("请输入" + i + "班" + j + "号同学的成绩：");
//                int score = scanner.nextInt();
//                if (score < 0 || score > 100) {
//                    do {
//                        System.out.print("输入有误，请输入" + i + "班" + j + "号同学的成绩：");
//                        score = scanner.nextInt();
//                    } while (score < 0 || score > 100);
//                }
//                if (score >= 60) {
//                    sum++;
//                }
//            }
//        }
//        System.out.println("三个班级中，合格的人数为：" + sum + "人");

        // 3.答应9*9乘法表
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " * " + i + " = " + (i * j));
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
    }
}
