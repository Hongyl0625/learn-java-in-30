package com.asiainfo.chapter06;

/**
 * 数组赋值机制 引出对象的赋值机制
 */
public class ArrayAssign {

    public static void main(String[] args) {
        // 基本数据类型赋值，赋值方式是值拷贝
        // n2的变化不会影响n1
        int n1 = 2;
        int n2 = n1;

        n2 = 30;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        // 数组的赋值方式是引用传递，赋的值是一个地址。
        // arr2的变化会影响到arr1
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        arr2[0] = 10;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
