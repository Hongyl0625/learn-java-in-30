package com.asiainfo.chapter05;

public class ForExecise {
    public static void main(String[] args) {

//        编程思想1 化繁为简，先死后活
//        化繁为简：即将复杂的需求，拆解成简单的需求，逐步完成。
//        先死后活：先考虑固定的值，然后转成可以灵活变化的值。

        // 练习1 打印1～100之间所有是9的倍数的整数，统计个数 及 总和。
        // 思路分析：
        // 化繁为简：
        // 1.循环1-100的整数
        // 2.判断每一个整数是否可以被9整除，如果可以，就输出这个值；
        // 2.1 当条件满足时，count++，用于统计个数；
        // 2.2 当条件满足时，sum+=i，用于统计总和；
        // 先死后活：
        // 1.为了适应更好的需求，把范围的开始值和结束值，做成变量
        // 2.还可以更进一步，将 9 的倍数 这个 9 也替换为变量

//        int sum = 0; // 总和
//        int count = 0; // 个数
//        int start = 1; // 起始值
//        int end = 100; // 结束值
//        int t = 9; // 谁的倍数
//        int i = start;
//        for (; i <= end; i++) {
//            if (i % t == 0) {
//                System.out.println(i);
//                count++;
//                sum += i;
//            }
//        }
//        System.out.println("sum = " + sum);
//        System.out.println("count = " + count);

        // 练习2 完成如下的表达式输出
//        0 + 5 = 5
//        1 + 4 = 5
//        2 + 3 = 5
//        3 + 2 = 5
//        4 + 1 = 5
//        5 + 0 = 5

        for (int i = 0, j = 5; i <= 5; i++, j--) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
    }
}
