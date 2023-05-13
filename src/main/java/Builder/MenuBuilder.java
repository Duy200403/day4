package Builder;
import java.util.ArrayList;
import java.util.List;
public class MenuBuilder {
    private List<MenuItem> menuItems;

    public MenuBuilder() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(String name, int quantity, String specialRequest) {
        MenuItem menuItem = new MenuItemImpl(name, quantity, specialRequest);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

