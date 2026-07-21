package com.demo;

public class _11_Static {
    static int x = 2000; // global or class variable
    int y = 300;

    static {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
//        int x = 100; // local variable
//        System.out.println(x);

//        com.demo._8_Demo demo1 = new com.demo._8_Demo();
//        com.demo._8_Demo demo2 = new com.demo._8_Demo();
//
//        demo1.x = 300;
//        demo2.x = 400;
//
//        System.out.println(com.demo._8_Demo.x);
//        System.out.println(com.demo._8_Demo.y);


//        com.demo.Student john = new com.demo.Student();
//        john.name = "john";
//        com.demo.Student peter = new com.demo.Student();
//        peter.name = "peter";
//
//        System.out.println(com.demo.Student.college);

        System.out.println(x);

        _11_Static obj = new _11_Static();
        System.out.println(obj.y);

        obj.add();
    }


    public void add() {
        System.out.println(x);
        System.out.println(y);
    }
}

// static function -> you can access static variables/functions
// static function -> to access non static variables/functions we need to create an object

// non static function -> you can access static variables/functions as well as non static variables/functions