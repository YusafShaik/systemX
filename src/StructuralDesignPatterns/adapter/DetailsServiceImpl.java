package StructuralDesignPatterns.adapter;

public class DetailsServiceImpl implements DetailsService{

    @Override
    public String getNumberUsingEmail(String email) {
        return "Sample Number";
    }

}
