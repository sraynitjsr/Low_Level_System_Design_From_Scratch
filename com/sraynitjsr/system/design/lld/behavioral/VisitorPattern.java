package com.sraynitjsr.system.design.lld.behavioral;

interface Visitable {
    void accept(Visitor visitor);
}

class ConcreteElementA implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operationA() {
        System.out.println("Operation A of ConcreteElementA");
    }
}

class ConcreteElementB implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operationB() {
        System.out.println("Operation B of ConcreteElementB");
    }
}

interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}

class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visitor is visiting ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visitor is visiting ConcreteElementB");
        elementB.operationB();
    }
}

public class VisitorPattern {
    public static void start() {
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();
        Visitor visitor = new ConcreteVisitor();
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
