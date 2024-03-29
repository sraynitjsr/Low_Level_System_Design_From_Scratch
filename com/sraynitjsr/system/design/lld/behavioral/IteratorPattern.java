package com.sraynitjsr.system.design.lld.behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Aggregate {
    Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public int getCount() {
        return items.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}

class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.getCount();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return aggregate.getItem(index++);
        }
        return null;
    }
}

public class IteratorPattern {
    public static void start() {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
