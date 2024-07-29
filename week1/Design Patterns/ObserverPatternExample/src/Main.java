import java.util.LinkedList;
import java.util.List;

interface Stock {
    public void register(Observer observer);

    public void deregister(Observer observer);

    public void notifyClient();
}

interface Observer {
    public void update();
}

class StockMarket implements Stock {

    List<Observer> observerList = new LinkedList<>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyClient() {
        for (Observer obs : observerList)
            obs.update();
    }
}

class MobileApp implements Observer {
    String name;

    MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Stocks on mobile " + this.name);
    }
}

class WebApp implements Observer {
    String name;

    WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Stocks on web " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        MobileApp m1 = new MobileApp("Sai");
        MobileApp m2 = new MobileApp("Toffee");
        WebApp w1 = new WebApp("Jojo");
        WebApp w2 = new WebApp("Saul");

        StockMarket sm = new StockMarket();
        sm.register(m1);
        sm.register(m2);
        sm.register(w1);
        sm.register(w2);
        sm.deregister(m2);

        sm.notifyClient();
    }
}