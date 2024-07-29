public class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2); // prints true, indicating
        // only one instance of the singleton class is created
    }
}

class Logger {
    private static final Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getLogger() {
        return logger;
    }
}