package com.sraynitjsr.system.design.lld.creational;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle Method.");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square Method.");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle Method.");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class Factory {
    public static void start() {
        System.out.println("********Factory Design Pattern********");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
  
        Shape shape2 = shapeFactory.getShape("RECTANGLE");        
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("SQUARE");          
        shape3.draw();
    }
}
