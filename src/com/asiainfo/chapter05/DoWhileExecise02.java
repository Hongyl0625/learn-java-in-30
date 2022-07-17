package com.asiainfo.chapter05;

import java.util.Scanner;

public class DoWhileExecise02 {
    public static void main(String[] args) {
        // 如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
        Scanner scanner = new Scanner(System.in);

        char c ;
        do {
            System.out.println("五连鞭～");
            System.out.println("老韩问：还钱吗？y/n");
            c = scanner.next().charAt(0);
        } while (c != 'y');
    }
}
