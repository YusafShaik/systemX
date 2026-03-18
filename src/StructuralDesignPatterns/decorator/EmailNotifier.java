package StructuralDesignPatterns.decorator;

public class EmailNotifier implements Notifier{
    @Override
    public void alert() {
        System.out.println("Email alerts");
    }
}
