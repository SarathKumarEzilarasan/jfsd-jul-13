package com.demo;

public class _6_Loops {
    public static void main(String[] args) {
        // loops -> while , for , do while

//        int counter = 3;
//        while (counter > 0) {
//            System.out.println(counter);
//            counter--;
//        }

//        for (int counter = 3; counter > 0; counter++) {
//            System.out.println(counter);
//        }

//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter--;
//        } while (counter > 0);

//        for (int i = 1; i <= 5; i++) {        // 1[5] 2[5] 3[5] 4[5] 5[5]
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {        // 1[5] 2[5] 3[5] 4[5] 5[5]
//            for (int j = 1; j <= 6 - i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 4; i++) {
//            for (int k = 1; k <= 4 - i; k++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // iteration
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3){
////                break;
//                continue;
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i <= 5 ; i++) {       // 1[1][5]  1[2][5] 1[3][5]
            for (int j = 1; j <= 5 ; j++) {
                for (int k = 1; k <= 5 ; k++) {
                    System.out.println(k);
                }
            }
        }
    }
}
