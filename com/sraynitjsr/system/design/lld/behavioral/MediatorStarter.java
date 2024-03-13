package com.sraynitjsr.system.design.lld.behavioral;

import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void sendMessage(String message, Colleague colleague);
}

class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague col : colleagues) {            
            if (col != colleague) {
                col.receiveMessage(message);
            }
        }
    }
}

interface Colleague {
    void sendMessage(String message);
    void receiveMessage(String message);
}

class ConcreteColleague implements Colleague {
    private Mediator mediator;

    public ConcreteColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

public class MediatorStarter {
    public static void start() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague colleague1 = new ConcreteColleague(mediator);
        ConcreteColleague colleague2 = new ConcreteColleague(mediator);
        ConcreteColleague colleague3 = new ConcreteColleague(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);

        colleague1.sendMessage("Hello from colleague 1!");
        colleague2.sendMessage("Hi, colleague 2 here!");
        colleague3.sendMessage("Greetings from colleague 3!");
    }
}
