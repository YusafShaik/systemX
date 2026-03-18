package StructuralDesignPatterns.decorator;

public class SmsDecorator implements Notifier {

    Notifier notifier;

    SmsDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void alert() {

        System.out.println("Sms alerts");
        notifier.alert();

    }
}
