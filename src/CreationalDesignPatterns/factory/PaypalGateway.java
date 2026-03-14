package CreationalDesignPatterns.factory;

public class PaypalGateway implements PaymentGateway{

    private static PaypalGateway gateway;

    private PaypalGateway(){

    }

    public static PaypalGateway getInstance(){
        if(gateway==null){
            gateway=new PaypalGateway();
        }
        return gateway;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Amount of "+amount+ " Is Processed through Paypal Gateway");
    }
}
