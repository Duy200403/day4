package Builder;

public class Menu implements MenuItem{
    private String name;
    private int quantity;
    private String specialRequest;

    public Menu(String name, int quantity, String specialRequest) {
        this.name = name;
        this.quantity = quantity;
        this.specialRequest = specialRequest;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getSpecialRequest() {
        return specialRequest;
    }
}
