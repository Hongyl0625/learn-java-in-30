package com.asiainfo.chapter05;

/**
 * 6、输出1-100之间的不能被5整除的数，每5个一行
 */
public class ControlStructureExecise06 {
    public static void main(String[] args) {
        /*
        思路分析：
        1、遍历1-100
        2、分别判断是否能被5整除
        3、利用m来统计输出个数，等于5时就换行，并重置m。
         */
        int m = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                m++;
                if (m < 5) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(i);
                    m = 0;
                    System.out.println();
                }
            }
        }
    }
}
