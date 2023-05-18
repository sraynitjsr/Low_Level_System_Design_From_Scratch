package com.sraynitjsr.system.design;

import com.sraynitjsr.system.design.lld.structural.*;
import com.sraynitjsr.system.design.lld.creational.*;
import com.sraynitjsr.system.design.lld.behavioral.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("System Design From Scratch");
        
        System.out.println("Singleton Design Pattern");
        Singleton.start();

        System.out.println("Builder Design Pattern");
        Builder.start();

        System.out.println("Factory Design Pattern");
        Factory.start();

        System.out.println("Decorator Design Pattern");
        Decorator.start();

        System.out.println("Facade Design Pattern");
        Facade.start();

        System.out.println("Strategy Design Pattern");
        Strategy.start();

        System.out.println("Observer Design Pattern");
        Observer.start();
    }
}
