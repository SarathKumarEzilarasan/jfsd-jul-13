package oops.polymorphism.overloading;

public class OverloadingDemo {
    public static void main(String[] args) {
        add(100, 200);
        add(100.001, 100);
        add(100, 200, 300);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }
//    public static int add(double a, int b) {
//        System.out.println(a + b);
//        return 0;
//    }
}

// method name + no. of arguments/ different types of input -> unique