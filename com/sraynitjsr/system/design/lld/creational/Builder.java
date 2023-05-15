package com.sraynitjsr.system.design.lld.creational;

class Student {
    private String name;
    private int roll;
    public Student(String name, int roll) {
        super();
        this.name = name;
        this.roll = roll;
    }
    public String toString() {
        return "Student's Name is => " + this.name + " and Student's Roll is => " + this.roll;
    }
}

class StudentBuilder {
    private String name;
    private int roll;
    public StudentBuilder setNameOnly(String str) {
        this.name = str;
        return this;
    }
    public StudentBuilder setRollOnly(int roll) {
        this.roll = roll;
        return this;
    }
    public Student newStudent() {
        return new Student(this.name, this.roll);
    }
}

public class Builder {
    public static void start() {
        System.out.println("Builder Design Pattern Using Fluent Interface Concept");
        
        Student onlyName = new StudentBuilder().setNameOnly("Subhradeep Ray").newStudent();
        System.out.println("Only Name Set Student => " + onlyName);

        Student onlyRoll = new StudentBuilder().setRollOnly(46).newStudent();
        System.out.println("Only Roll Set Student => " + onlyRoll);

        Student nameAndRollBothSet = new StudentBuilder().setNameOnly("Subhradeep Ray is Name").setRollOnly(46).newStudent();        
        System.out.println("Name and Roll Both Set Student => " + nameAndRollBothSet);
    }
}
