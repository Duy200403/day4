package Builder;

import java.util.ArrayList;
import java.util.List;

public interface Order {
    List<MenuItem> getItems();

    class Builder {
        private List<MenuItem> items;

        public Builder() {
            items = new ArrayList<>();
        }

        public void addItem(MenuItem item) {
            items.add(item);
        }

        public Order build() {
            return new OrderImpl(items);
        }
    }
}
