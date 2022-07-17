package com.asiainfo.chapter05;

import java.util.Scanner;

public class BreakExecise {
    public static void main(String[] args) {
//        1-100以内的数求和，求出 当和 第一次大于20的当前数

        // 1.循环从1加到100
        // 2.当和大于20时结束循环，并输出当前的循环变量
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            if (sum > 20) {
//                System.out.println(i);
//                break;
//            }
//        }

//        实现登录验证，有3次机会，如果用户名为'丁真'，密码为'666'提示登录成功，否则提示还有几次机会。
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("username:");
            String username = scanner.next();
            System.out.println("password:");
            String password = scanner.next();
            if ("丁真".equals(username) && "666".equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("输入有误，还有" + (3 - i) + "次机会");
            }
        }
    }
}
