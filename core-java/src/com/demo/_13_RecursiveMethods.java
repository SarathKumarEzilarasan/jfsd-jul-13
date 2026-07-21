package com.demo;

public class _13_RecursiveMethods {
    public static void main(String[] args) {
//        print(3);
//        5! -> 5*4*3*2*1

        System.out.println(factorial(5));
    }

    // recursive methods or recursion
    public static void print(int i) {
        // base condition
        if (i == 0) {
            return;
        }
        System.out.println(i);
        i--;
        print(i);
    }

//    main -> print(2) -> print(1) -> print(0)

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1); // 5 * 4 * 3 * 2 * 1
    }
}

// [main -> print -> print -> print -------------]