package StructuralDesignPatterns.adapter;

public class LegacyTelecomBiller {

    void processPayment(int amountInCents,String mobileNumber){
        System.out.println("Charging "+amountInCents +" from "+mobileNumber);

    }
}
