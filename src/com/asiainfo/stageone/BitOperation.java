package com.asiainfo.stageone;

public class BitOperation {

    public static void main(String[] args) {
//        int a = 1>>2;// 0000 0001 --> 0000 000001
//        int b = -1>>2;// 1000 0001 --> 0010 0000 0001
//        int c = 1<<2;
//        int d = -1<<2;
//        int e = 3>>>2;
//
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("c="+c);
//        System.out.println("d="+d);
//        System.out.println("e="+e);

        // 推导过程
        // 2的原码 00000000 00000000 00000000 00000010
        // 3的原码 00000000 00000000 00000000 00000011
            // 计算过程需要利用补码计算：由于两个计算数字都为正数，因为三码合一，所以补码 = 原码
            // 00000000 00000000 00000000 00000010 （补码）
            // 00000000 00000000 00000000 00000011 （补码）
            // 00000000 00000000 00000000 00000010 （补码）
        // 结果要转换为原码 但可以看出计算结果也为正数，因为三码合一，所以原码 = 补码
        // 结果为 00000000 00000000 00000000 00000010 （原码）
        System.out.println(2&3);// 2

        // 推导过程
        // 2原码 00000000 00000000 00000000 00000010
        // 3原码 00000000 00000000 00000000 00000011
        // 正数三码合一
            // 00000000 00000000 00000000 00000010
            // 00000000 00000000 00000000 00000011
            // 00000000 00000000 00000000 00000011 补码的结果
        // 原码 00000000 00000000 00000000 00000011 --> 3
        System.out.println(2|3);// 3

        // 推导过程
        // 2原码 00000000 00000000 00000000 00000010
        // 3原码 00000000 00000000 00000000 00000011
        // 正数三码合一
            // 00000000 00000000 00000000 00000010
            // 00000000 00000000 00000000 00000011
            // 00000000 00000000 00000000 00000001 补码计算结果
        // 原码 00000000 00000000 00000000 00000001 --> 1
        System.out.println(2^3);// 1

        // 推导过程
        // 2的原码                    00000000 00000000 00000000 00000010
        // 2的补码                    00000000 00000000 00000000 00000010 三码合一
        // 取反                       11111111 11111111 11111111 11111101 补码的结果
        // 负数的反码 = 负数的补码 - 1 = 11111111 11111111 11111111 11111100
        // 负数的原码                  10000000 00000000 00000000 00000011 符号位不变，其余取反
        System.out.println(~2);// -3

        // 推导过程
        // 先得到-2的补码（因为计算过程均使用补码计算）
            // 负数的原码                              10000000 00000000 00000000 00000010
            // 负数的反码：符号位不变，其他取反            11111111 11111111 11111111 11111101
            // 负数的补码：反码+1                       11111111 11111111 11111111 11111110
        // 取反                                       00000000 00000000 00000000 00000001 （补码）
        // 结果 补码转原码 ：判断上述补码为证书，所以原码也为 00000000 00000000 00000000 00000001
        System.out.println(~-2);// 1
    }
}