public class Order {
    int orderId;
    String customerName;
    float totalPrice;

    Order(int id, String name, float price) {
        orderId = id;
        customerName = name;
        totalPrice = price;
    }

    @Override
    public String toString() {
        return new String("id: " + orderId + "\nname: " + customerName + "\nprice: " + totalPrice);
//        return new String("" + totalPrice);
    }
}
