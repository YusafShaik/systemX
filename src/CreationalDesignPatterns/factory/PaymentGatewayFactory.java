package CreationalDesignPatterns.factory;

public class PaymentGatewayFactory {

    PaymentGateway getPaymentGateway(GatewayRequest gatewayRequest) {



        switch (getGatewayType(gatewayRequest.getAmount(), gatewayRequest.getCurrency())) {
            case "Razorpay":
                return RazorPaymentGateway.getInstance();
            case "Paypal":
                return  PaypalGateway.getInstance();
            case "Stripe":
                return  StripeGateway.getInstance();
            default:
                System.out.println("Something Went wrong");
        }

        return null;
    }

    String getGatewayType(int amount, String currencyType) {
        if (currencyType.equalsIgnoreCase("INR")) {
            return "Razorpay";
        } else if (amount > 1000) {
            return "Stripe";
        } else {
            return "Paypal";
        }
    }
}
