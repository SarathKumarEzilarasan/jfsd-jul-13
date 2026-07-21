package com.demo;

import java.util.Scanner;

public class _3_User_Input_Handling {
    public static void main(String[] args) {
        int age = 100;
        System.out.println(age);

        // variable, object , instance
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
    }
}
