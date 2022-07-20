package com.asiainfo.chapter05;

/**
 * 1、某人有100000元，每经过一次路口，需要缴费，规则如下：
 * 1）当现金>50000时，缴纳5%
 * 2）当现金<=50000时，每次缴纳1000
 * 编程计算该人可以经过多少次路口，要求：使用while break方式完成
 */
public class ControlStructureExecise01 {
    public static void main(String[] args) {
        int num = 0;
        double salary = 100000;
        while (true) {
            if (salary > 50000) {
                salary *= 0.95;
                num++;
            } else if (salary >= 1000) {
                salary -= 1000;
                num++;
            } else {
                break;
            }
        }
        System.out.println("该人可以经过" + num + "次路口");
    }
}
