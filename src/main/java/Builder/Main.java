import Builder.Bill;
import Builder.MenuBuilder;
import Builder.MenuItem;
import Builder.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Xây dựng menu
        MenuBuilder menuBuilder = new MenuBuilder();
        menuBuilder.addMenuItem("Banh Mi", 2, "No chili");
        menuBuilder.addMenuItem("Pho", 1, "Extra beef");
        menuBuilder.addMenuItem("Com Tam", 1, "No pickles");
        menuBuilder.addMenuItem("Bun Cha", 2, null);
        menuBuilder.addMenuItem("Bun Bo Hue", 1, null);
        menuBuilder.addMenuItem("Goi Cuon", 3, null);
        menuBuilder.addMenuItem("Ca Phe Sua Da", 2, "Less sugar");
        menuBuilder.addMenuItem("Tra Da", 1, null);
        menuBuilder.addMenuItem("Che", 1, null);
        menuBuilder.addMenuItem("Xoi Ga", 2, "Extra chicken");

        List<MenuItem> menuItems = menuBuilder.getMenuItems();

        // Tạo đối tượng order
        Order.Builder orderBuilder = new Order.Builder();
        for (MenuItem menuItem : menuItems) {
            orderBuilder.addItem(menuItem);
        }
        Order order = orderBuilder.build();

        // Tạo hóa đơn và in ra thông tin
        Bill.Builder billBuilder = new Bill.Builder();
        billBuilder.withOrder(order);
        billBuilder.withCustomerName("Duy");
        billBuilder.withCustomerAddress("123 ");
        Bill bill = billBuilder.build();

        bill.printBill();
    }
}