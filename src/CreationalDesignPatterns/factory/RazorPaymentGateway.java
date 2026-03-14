package CreationalDesignPatterns.factory;

public class RazorPaymentGateway implements PaymentGateway{

    private static  RazorPaymentGateway gateway=null;

    private RazorPaymentGateway(){

    }

    public static RazorPaymentGateway getInstance(){
         if(gateway==null){
             gateway=new RazorPaymentGateway();
         }
         return gateway;
    }

    @Override
    public void processPayment(int amount) {
        System.out.println("Ampunt of "+ amount+" Is processed through razorpay gateway");
    }
}
