package com.asiainfo.chapter06;

/**
 * 2、请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标。
 */
public class ArrayExecise02 {
    public static void main(String[] args) {
        /*
        思路分析：
        1、依据题目创建数组；
        2、创建两个变量，用于存储第一个元素和下标。
        3、遍历数组，当前获取元素大于变量中存储的值时，将两个变量都替换掉。
        4、当前获取元素小于变量中存储的值时，继续遍历
         */
        int[] arr = {4, -1, 9, 10, 23, 888};
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                index = i;
                max = arr[i];
            }
        }
        System.out.println("集合中数值最大的元素为" + max);
        System.out.println("该元素的下标为" + index);
    }
}
