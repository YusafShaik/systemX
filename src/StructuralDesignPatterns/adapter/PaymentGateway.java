package StructuralDesignPatterns.adapter;

public interface PaymentGateway {

    void processPayment(int amount,String email);
}
