package com.asiainfo.chapter05;

/**
 * 跳转控制语句 break
 */
public class Break01 {
    public static void main(String[] args) {
        // 1.循环输出随机数
        // 2.随机一次，计数加一
        // 3.输出97，退出循环
        int count = 0;
        while (true) {
            count++;
            int i = (int) (Math.random() * 100) + 1;
            System.out.println(i);
            if (i == 97) {
                break;
            }
        }
        System.out.println("输出97共用了" + count + "次");
    }
}
