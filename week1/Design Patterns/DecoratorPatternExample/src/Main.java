interface Notifier {
    public void send();
}

class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("You have a new mail, check your inbox.");
    }
}

abstract class NotifierDecorator implements Notifier {
    private Notifier notif;
    NotifierDecorator(Notifier notif){
        this.notif = notif;
    }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notif) {
        super(notif);
    }
    @Override
    public void send(){
        System.out.println("You have a new SMS.");
    }
}

class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notif) {
        super(notif);
    }
    @Override
    public void send(){
        System.out.println("You have a new Slack notification.");
    }
}

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send();
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send();
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send();
    }
}