package com.sraynitjsr.system.design.lld.structural;

import java.util.ArrayList;
import java.util.List;

interface Component {
    void operation();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " operation");
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }
}

public class CompositeExample {
    public static void start() {
        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf1);
        composite1.add(leaf2);
        composite2.add(leaf3);

        Composite composite = new Composite();
        composite.add(composite1);
        composite.add(composite2);

        composite.operation();
    }
}
