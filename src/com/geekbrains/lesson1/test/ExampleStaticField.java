package com.geekbrains.lesson1.test;

import com.geekbrains.lesson1.part1.Document;

public class ExampleStaticField extends Document {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        Base.y = 15;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("c.y = " + c.y);

    }


}
