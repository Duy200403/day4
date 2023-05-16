package FactoryMethod;

public class Titanium implements Card{

    @Override
    public String getCartType() {
        return "Titanium";
    }

    @Override
    public int getCreditLimit() {
        return 9000000;
    }

    @Override
    public int getAnnualCharge() {
        return 20;
    }
}
