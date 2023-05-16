package FactoryMethod;

public class MoneyBank  implements Card {
    @Override
    public String getCartType() {
        return "MoneyBank";
    }

    @Override
    public int getCreditLimit() {
        return 500000;
    }

    @Override
    public int getAnnualCharge() {
        return 100;
    }
}
