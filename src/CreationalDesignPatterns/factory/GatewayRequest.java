package CreationalDesignPatterns.factory;

public class GatewayRequest {

    private int amount;

    private String currency;

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public GatewayRequest(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
