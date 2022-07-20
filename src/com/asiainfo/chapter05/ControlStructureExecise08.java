package com.asiainfo.chapter05;

/**
 * 求出1-1/2+1/3-1/4+...1/100
 */
public class ControlStructureExecise08 {
    public static void main(String[] args) {
        /*
        1、遍历1-100
        2、将遍历的数作为分母，输出数字
        3、判断当前遍历的次数，奇数次加，偶数次减
         */
        double result = 0;
        String expretion = "0";
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                expretion += "\n";
            }
            if (i % 2 != 0) {
                result += 1.0 / i;
                expretion = expretion + " + " + 1.0 / i;
            } else {
                result -= 1.0 / i;
                expretion = expretion + " - " + 1.0 / i;
            }
        }
        System.out.println("expretion = " + expretion);
        System.out.println("result = " + result);
    }
}
