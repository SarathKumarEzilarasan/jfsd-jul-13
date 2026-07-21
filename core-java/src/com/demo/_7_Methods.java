package com.demo;

public class _7_Methods {
    public static void main(String[] args) {
//        add(100,200); // method call or method invocation
//        add(300, 400);
//        add(500, 400);

        // x+y-z
        int sum = add(100, 200);
        System.out.println(sum - 300);
    }

    //    custom method or user defined method
    //     method definition
    public static int add(int a, int b) { // method arguments or method parameters
        int x = a;
        int y = b;
//        System.out.println(x + y);

        return x + y;
    }
}

// main -> add