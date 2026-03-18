package StructuralDesignPatterns.decorator;

public class SlackDecorator implements Notifier {

    Notifier notifier;

    public SlackDecorator(Notifier notifier) {
        this.notifier = notifier;
    }


    @Override
    public void alert() {
        System.out.println("Slack message");
        notifier.alert();
    }
}
