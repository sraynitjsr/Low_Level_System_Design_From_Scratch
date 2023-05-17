package com.sraynitjsr.system.design.lld.creational;

class MyDatabase {
    private static MyDatabase instance;

    private MyDatabase() {
    }

    synchronized public static MyDatabase getInstance() {
        if (instance == null) {
            instance = new MyDatabase();
        }
        return instance;
    }
}

public class Singleton {
    public static void start() {        
        MyDatabase obj1 = MyDatabase.getInstance();
        System.out.println(obj1.getClass().getName() + " Obj1");

        MyDatabase obj2 = MyDatabase.getInstance();
        System.out.println(obj2.getClass().getName() + " Obj2");
    }
}
