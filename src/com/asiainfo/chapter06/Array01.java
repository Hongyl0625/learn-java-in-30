package com.asiainfo.chapter06;

import java.util.ArrayList;

/**
 * 数组的引出
 *
 * 数组可以存放多个 同一类型 的数据。数组也是一种数据类型，属于引用类型。
 */
public class Array01 {
    public static void main(String[] args) {
        /*
        它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。
        请问这六只鸡的总体重是多少？平均体重是多少？

        思路分析：（以现有知识）
        1、定义六个变量，用于存储六只鸡的重量
        2、总体重等于六个变量之和，平均体重等于六个变量之和处以六
        3、分析传统实现方法的问题。变量太多太多了，6->600怎么办？
        4、引出新的技术->使用数组来解决
         */
//        double hen1 = 3;
//        double hen2 = 5;
//        double hen3 = 1;
//        double hen4 = 3.4;
//        double hen5 = 2;
//        double hen6 = 50;
//
//        double total = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
//        double avg = total / 6;
//
//        System.out.println("六只鸡的总体重为" + total + "kg");
//        System.out.println("六只鸡的平均体重为" + avg + "kg");

        // 利用新技术数组来解决上述问题

        double totalweight = 0;
        double avgweight = 0;

        // 1、定义一个数组
        // a.(double[]表示 是一个double类型的数组，数组名为hens,
        // b.{3,5,1,3.4,2,50}表示数组的值/元素，依次表示数组的第几个元素)
        double[] hens = {3,5,1,3.4,2,50};

        // 2、遍历数组
        // a.可以通过hens[下标]来访问数组的元素（下标从0开始计数）
        // b.通过for可以访问数组中的每一个元素。
        for (int i = 0; i < hens.length; i++) {
            totalweight += hens[i];
        }
        avgweight = totalweight / hens.length;

        System.out.println("六只鸡的总体重为" + totalweight + "kg");
        System.out.println("六只鸡的平均体重为" + avgweight + "kg");
    }
}
