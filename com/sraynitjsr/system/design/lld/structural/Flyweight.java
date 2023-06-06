package com.sraynitjsr.system.design.lld.structural;

import java.util.*;

// Flyweight interface
interface Shape {
    void draw();
}

// Concrete flyweight class
class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a circle with color: " + color);
    }
}

// Flyweight factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a new circle with color: " + color);
        }

        return circle;
    }
}

// Client
public class Flyweight {
    private static final String[] colors = { "Red", "Blue", "Green", "Yellow", "Black" };

    public static void start() {
        System.out.println("********Flyweight Design Pattern********");
        for (int i = 0; i < 10; i++) {
            String newColor = colors[(int) (Math.random() * colors.length)];
            Circle circle = (Circle) ShapeFactory.getCircle(newColor);
            circle.draw();
        }
    }
}
