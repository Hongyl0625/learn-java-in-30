package com.asiainfo.chapter06;

public class ArrayDetail {
    public static void main(String[] args) {
        // 1、数组是多个相同类型数据的组合，实现对这些数据的统一管理。
        /*int[] arr1 = {1, 2, 3, "hello"};// String -> int 不可以
        double[] arr2 = {1.1, 2.2, 3.3, 100};// int -> double 符合类型自动转化，可以*/

        // 2、数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用（不能一个数组包含多个类型）
        /*String[] arr3 = {"北京", "米兰"};*/

        // 3、数组创建后，如果没有赋值（但分配了空间），各个元素均有默认值。
        // int 0 short 0 byte 0 long 0 float 0.0  double 0.0 char \u0000 boolean false String null
        /*int[] intArr = new int[2];
        System.out.println(intArr[0]);
        short[] shortArr = new short[2];
        System.out.println(shortArr[0]);
        byte[] byteArr = new byte[2];
        System.out.println(byteArr[0]);
        long[] longArr = new long[2];
        System.out.println(longArr[0]);
        float[] floatArr = new float[2];
        System.out.println(floatArr[0]);
        double[] doubleArr = new double[2];
        System.out.println(doubleArr[0]);
        char[] charArr = new char[2];
        System.out.println(charArr[0]);
        boolean[] booleanArr = new boolean[2];
        System.out.println(booleanArr[0]);
        String[] strArr = new String[2];
        System.out.println(strArr[0]);*/

        // 4、使用数组的步骤：1.声明数组并开辟空间 2.给数组各个元素赋值 3.使用数组
        /*int[] arr4 = new int[2];// 声明+开辟空间
        arr4[0] = 1;arr4[1] = 2;// 给数组的各个元素赋值
        System.out.println(arr4[0]);// 使用数组*/

        // 5、数组的下标是从0开始的

        // 6、数组下标必须在指定范围内使用，否则会报：下标越界异常
        /*int[] arr5 = new int[3];
        arr5[3] = 1; // ArrayIndexOutOfBoundsException*/

        // 7、数组属于引用类型，数组型数据是对象（Object）
        int[] arr6 = new int[2];
        System.out.println(arr6 instanceof Object);
    }
}
