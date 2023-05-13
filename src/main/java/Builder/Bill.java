package Builder;

public interface Bill {
    void printBill();

    class Builder {
        private Order order;
        private String customerName;
        private String customerAddress;

        public Builder withOrder(Order order) {
            this.order = order;
            return this;
        }

        public Builder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public Builder withCustomerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public Bill build() {
            return new BillImpl(order, customerName, customerAddress);
        }
}
}
