package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Card card = CardFactory.getCard("Platinum");
        if (card != null){
            System.out.println("Loại thẻ:" + card.getCartType());
            System.out.println("Giới hạn:" + card.getCreditLimit());
            System.out.println("Phi:" + card.getAnnualCharge());
        }
    }
}
