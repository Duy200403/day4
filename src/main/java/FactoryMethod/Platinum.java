package FactoryMethod;

public class Platinum implements Card{
    @Override
    public String getCartType() {
        return "Platinum";
    }

    @Override
    public int getCreditLimit() {
        return 5000000;
    }

    @Override
    public int getAnnualCharge() {
        return 100;
    }
}
