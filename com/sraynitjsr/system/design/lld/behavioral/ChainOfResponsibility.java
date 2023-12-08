interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(String request);
}

class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Handler1")) {
            System.out.println("ConcreteHandler1 handling the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can process the request");
        }
    }
}

class ConcreteHandler2 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Handler2")) {
            System.out.println("ConcreteHandler2 handling the request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can process the request");
        }
    }
}

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        
        handler1.setNextHandler(handler2);

        handler1.handleRequest("Handler1");
        handler1.handleRequest("Handler2");
        handler1.handleRequest("Handler3");
    }
}
