package StructuralDesignPatterns.decorator;

public class Main {


    public static void main(String[] args) {

        Notifier emailNotifier= new EmailNotifier();

        Notifier smsAndSlackNotifier= new SmsDecorator(new SlackDecorator(new EmailNotifier()));

        emailNotifier.alert();
        smsAndSlackNotifier.alert();

    }
}
