package Builder;

public class MenuItemImpl implements MenuItem {
    private String name;
    private int quantity;
    private String specialRequest;

    public MenuItemImpl(String name, int quantity, String specialRequest) {
        this.name = name;
        this.quantity = quantity;
        this.specialRequest = specialRequest;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }
}
