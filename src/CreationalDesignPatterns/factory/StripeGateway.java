package CreationalDesignPatterns.factory;

public class StripeGateway implements PaymentGateway{

    private static StripeGateway gateway;

    private StripeGateway(){

    }

    public static StripeGateway getInstance(){
        if(gateway==null){
            gateway= new StripeGateway();
        }
        return gateway;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Amount of "+amount+" is Processed through Stripe payment gateway");
    }
}
