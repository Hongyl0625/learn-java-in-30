package com.asiainfo.chapter05;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        练习题1
//        System.out.println("请输入字符（a-e）：");
//        char c = scanner.next().charAt(0);
//
//        switch (c) {
//            case 'a' :
//                System.out.println("A");
//                break;
//            case 'b' :
//                System.out.println("B");
//                break;
//            case 'c' :
//                System.out.println("C");
//                break;
//            case 'd' :
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("other");
//        }

//        练习题2
//        System.out.println("请输入您的成绩(0-100)：");
//        double score = scanner.nextDouble();
//        if (score > 0 && score <= 100) {
//            switch ((int)(score/60)) {
//                case 1 :
//                    System.out.println("合格");
//                    break;
//                case 0 :
//                    System.out.println("不合格");
//            }
//        } else {
//            System.out.println("成绩输入不合法");
//        }

//        练习题3
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 3 :
            case 4 :
            case 5 :
                System.out.println("春季");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("夏季");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("秋季");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
