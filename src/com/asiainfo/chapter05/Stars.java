package com.asiainfo.chapter05;

public class Stars {
    public static void main(String[] args) {
        // 请编写一个程序，可以接收一个整数，表示层数（totalLevel)，打印出金字塔。
//        *
//        **
//        ***
//        ****
//        *****
//        for (int totalLevel = 1; totalLevel <= 5; totalLevel++) {
//            for (int i = 1; i <= totalLevel; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//          *   1  2  1
//         ***  2  1  3
//        ***** 3  0  5
//        int totallevel = 6;
//        for (int i = 1; i <= totallevel; i++) {
//            for (int j = 1; j <= totallevel - i; j++) {
//                System.out.print(" ");
//            }
//            for (int n = 1; n <= (2 * i - 1); n++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//            *
//           * *
//          *   *
//         *     *
//        *********

//        for (int i = 1; i <= 5; i++) {
//            for (int m = 1; m <= 5 - i; m++) {
//                System.out.print(" ");
//            }
//            int j;
//            for (j = 1; j <= 2 * i - 1; j++) {
//                if (j == 1 || j == 2 * i - 1 || i == 5) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//            *
//           * *
//          *   *
//         *     *
//        *       *
//         *     *
//          *   *
//           * *
//            *
        // 1.先打印上面5层
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                if (m == 1 || m == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= -2 * i + 11; m++) {
                if (m == 1 || m == -2 * i + 11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
