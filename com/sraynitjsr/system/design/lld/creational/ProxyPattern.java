interface RealSubject {
    void request();
}

class RealSubjectImpl implements RealSubject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

class Proxy implements RealSubject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }
        realSubject.request();
    }
}

public class ProxyPattern {
    public static void start() {
        RealSubject proxy = new Proxy();
        proxy.request();
    }
}
