package com.asiainfo.chapter06;

/**
 * 3、求出一个数组的和和平均值
 */
public class ArrayExecise03 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 7, 1};
        int total = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        avg = (double) total/arr.length;

        System.out.println("arr集合的和为" + total);
        System.out.println("arr集合的平均值为" + avg);
    }
}
