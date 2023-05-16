package FactoryMethod;

public class CardFactory {
    private CardFactory(){}
    public static Card getCard(String card){
        switch (card){
            case "Platinum":
                return new Platinum();
            case "Gold":
                return new Titanium();
            default:
                return null;
        }
    }
}
