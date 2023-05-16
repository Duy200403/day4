package FactoryMethod;

public class CardFactory {
    private CardFactory(){}
    public static Card getCard(String card){
        switch (card){
            case "Platinum":
                return new Platinum();
            case "Gold":
                return new Titanium();
            case "MoneyBank":
                return new MoneyBank();
            default:
                return null;
        }
    }
}
