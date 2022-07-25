package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Child child = new Child();
        child.sayHello();
        child.sayHello("overloaded Method");
        
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

