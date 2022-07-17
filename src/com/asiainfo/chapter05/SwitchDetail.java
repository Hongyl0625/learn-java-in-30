package com.asiainfo.chapter05;

public class SwitchDetail {
    public static void main(String[] args) {
        // 1、表达式数据类型，应和case后的常量类型保持一致
        // 或者是 可以自动转换成 可以相互比较的类型，比如输入的是字符，而常量是int
//        char c = 'a';
//        switch (c) {
//            case 'a' :
//                System.out.println("OK1");
//                break;
//            case 'b' :
//                System.out.println("OK2");

//            case 20 : // 可以正常编译，因为 char 和 int 可以自动转化
//                System.out.println("OK2");

//            case "hello": // 无法编译通过，因为 char 和 String 无法自动转化
//                System.out.println("OK2");
//                break;
//            default:
//                System.out.println("OK3");
//        }

        // 细节2
        // switch(表达式) 中 表达式的返回值必须是以下几个类型
        // 【byte,short,int,char,enum,String】
//        double d = 2.1;
//        不兼容的类型。实际为 double'，需要 'char、byte、short、int、Character、Byte、Short、Integer、String 或枚举
//        switch (d) {
//            case 2.1 :
//                System.out.println("OK1");
//                break;
//            case 2.2 :
//                System.out.println("OK2");
//                break;
//            default:
//                System.out.println("OK3");
//        }

//        细节3
//        case子句中的值必须是常量（1，'a')或常量表达式('b'+1)
//        char c1 = 'a';
//        char c2 = 'b';
//        switch (c1) {
//            case 'a' :
//                System.out.println("OK1");
//                break;
//            case c2 : // 需要常量表达式
//                System.out.println("OK2");
//                break;
//            default:
//                System.out.println("OK3");
//        }

//        细节4
//        default子句是可选的，当没有匹配case时，执行default
//        如果没有default子句，又没有匹配任何常量，则没有输出

//        细节5
//        break语句用于在执行完一个case分支后使程序跳出switch语句块；
//        如果没有写break，则会持续穿透执行到后续的case分支。
        switch ('a') {
            case 'a' :
                System.out.println("OK1");
//                break;
            case 'b' :
                System.out.println("OK2");
                break;
            default:
                System.out.println("OK3");
        }
    }
}
