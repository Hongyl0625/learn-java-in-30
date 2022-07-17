package com.asiainfo.chapter05;

public class ForDetail {
    public static void main(String[] args) {
        // for(循环变量初始化; 循环判断条件; 循环变量迭代) { 循环操作 }

        // 细节1
        // 循环条件是返回一个布尔值的表达式

        // 细节2
        // for(; 循环条件;)中的「循环变量初始化」和「循环变量迭代」可以写到其他地方，但是两边的分号不能省略
        // 扩大了循环变量i的作用域，可以在循环体外使用。
        int i = 1;
        for (; i <= 10; ) {
            System.out.println("你好，韩顺平教育！");
            i++;
        }
        System.out.println("i = " + i);// 11

        // 细节3
        // 可以设置多个 「循环初始化变量」 和 「循环变量迭代」
        // 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开；
        // 循环变量迭代也可以有多条变量迭代语句，中间同样用逗号隔开。
        int count = 3;
        int n = 0, j = 0;
        for (; n < count; n++, j += 2) {
            System.out.println("n = " + n + ", j = " + j);
            // n = 0, j = 0
            // n = 1, j = 2
            // n = 2, j = 4
        }
        System.out.println("n = " + n + ", j = " + j);// n = 3, j = 6
    }
}
