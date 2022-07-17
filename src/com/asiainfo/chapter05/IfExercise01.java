package com.asiainfo.chapter05;

public class IfExercise01 {
    public static void main(String[] args) {
        double d1 = 11d;
        double d2 = 12d;
        if (d1 > 10.0 && d2 <20.0) {
            System.out.println(d1 + d2);
        }

        int i1 = 31;
        int i2 = 14;
        int i = i1 + i2;
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + "能被3又能被5整除");
        } else {
            System.out.println(i + "不能被3和5同时整除");
        }

        int year = 2000;
        if ((year % 4 == 0 && year % 400 != 0) || year % 400 == 0) {
            System.out.println(year + "年 是闰年");
        } else {
            System.out.println(year + "年 不是闰年");
        }
    }
}
