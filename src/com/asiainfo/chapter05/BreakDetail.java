package com.asiainfo.chapter05;

/**
 * break注意事项和细节说明：
 * 1、break语句出现多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块
 * 1）break语句可以指定退出哪一层；
 * 2）label1是标签，名字由程序员自定义；
 * 3）break后指定到哪个label就退出到哪里；
 * 4）在实际开发中，尽量不要使用标签；
 * 5）如果没有指定标签，默认退出最近的循环体；
 */
public class BreakDetail {
    public static void main(String[] args) {
        label1:
        for (int j = 0; j < 4; j++) {
            label2:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    break label1;
                }
                System.out.println("i = " + i);
                // i = 0
                // i = 1
            }
        }
    }
}
