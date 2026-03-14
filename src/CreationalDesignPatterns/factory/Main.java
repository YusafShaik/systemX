package CreationalDesignPatterns.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern Main class");

        PaymentGatewayFactory paymentGatewayFactory= new PaymentGatewayFactory();

        GatewayRequest gatewayRequest= new GatewayRequest(1200,"USD");

        PaymentGateway paymentGateway=paymentGatewayFactory.getPaymentGateway(gatewayRequest);

        paymentGateway.processPayment(gatewayRequest.getAmount());
    }
}
