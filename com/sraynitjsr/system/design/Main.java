package com.sraynitjsr.system.design;

import com.sraynitjsr.system.design.lld.structural.*;
import com.sraynitjsr.system.design.lld.creational.*;
import com.sraynitjsr.system.design.lld.behavioral.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("********System Design From Scratch********");

        System.out.println();
        Observer.start();
        System.out.println();        
        Strategy.start();
        System.out.println();
        ChainOfResponsibility.start();
        System.out.println();
        MediatorStarter.start();

        System.out.println();
        Builder.start();
        System.out.println();
        Factory.start();
        System.out.println();
        Prototype.start();
        System.out.println();
        Singleton.start();
        System.out.println();
        ProxyPattern.start();

        System.out.println();
        Adapter.start();
        System.out.println();
        Decorator.start();
        System.out.println();
        Facade.start();
        System.out.println();
        Flyweight.start();
        System.out.println();
        CompositeExample.start()
    }
}
