package Builder;

import java.util.List;

public class OrderImpl implements Order{
    private List<MenuItem> items;

    public OrderImpl(List<MenuItem> items) {
        this.items = items;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
