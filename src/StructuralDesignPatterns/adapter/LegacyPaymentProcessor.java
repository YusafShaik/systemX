package StructuralDesignPatterns.adapter;

public class LegacyPaymentProcessor implements PaymentGateway{

    LegacyTelecomBiller legacyTelecomBiller;

    DetailsService detailsService;

    public LegacyPaymentProcessor(LegacyTelecomBiller legacyTelecomBiller, DetailsService detailsService) {
        this.legacyTelecomBiller=legacyTelecomBiller;
        this.detailsService = detailsService;
    }

    @Override
    public void processPayment(int amount, String email) {
        int amounInCents=amount*100;
        String mobileNumber=detailsService.getNumberUsingEmail(email);

        legacyTelecomBiller.processPayment(amounInCents,mobileNumber);
    }
}
