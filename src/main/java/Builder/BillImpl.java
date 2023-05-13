package Builder;

public class BillImpl implements Bill {
    private Order order;
    private String customerName;
    private String customerAddress;

    public BillImpl(Order order, String customerName, String customerAddress) {
        this.order = order;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void printBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("========== Order Items ==========");
        for (MenuItem item : order.getItems()) {
            System.out.println("Name: " + item.getName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Special Request: " + item.getSpecialRequest());
            System.out.println("===============================");
        }
    }
}
