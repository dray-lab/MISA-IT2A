package misa.it2a;

public class Order {
    public int orderId;
    public String customerName;
    public String orderDate;
    public double orderAmount;
    public String orderStatus;

    public Order(int orderId, String customerName, String orderDate, double orderAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    public String toString() {
        return String.format("%-10d %-12s %-12s $%-10.2f %s", orderId, customerName, orderDate, orderAmount, orderStatus);
    }
}


