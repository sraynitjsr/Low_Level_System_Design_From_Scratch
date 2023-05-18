package com.sraynitjsr.system.design;

import com.sraynitjsr.system.design.lld.creational.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("System Design From Scratch");
        
        System.out.println("Singleton Design Pattern");
        Singleton.start();

        System.out.println("Builder Design Pattern");
        Builder.start();

        System.out.println("Factory Design Pattern");
        Factory.start();
    }
}
