package StructuralDesignPatterns.adapter;



public class Main {

    public static void main(String[] args) {

        DetailsService detailsService= new DetailsServiceImpl();

        PaymentGateway paymentGateway= new LegacyPaymentProcessor(new LegacyTelecomBiller(), detailsService) ;

        paymentGateway.processPayment(5,"Spoof@gmail.com");

    }
}
