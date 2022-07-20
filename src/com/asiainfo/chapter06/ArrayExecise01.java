package com.asiainfo.chapter06;

/**
 * 创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。使用for循环访问所有元素并打印出来。
 */
public class ArrayExecise01 {
    public static void main(String[] args) {
        char[] charArr = new char[26];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char)('A'+i);
        }
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }
}
