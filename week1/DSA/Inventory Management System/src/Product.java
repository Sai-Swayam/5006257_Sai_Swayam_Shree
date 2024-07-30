public class Product {
    int productId;
    String productName;
    int quantity;
    float price;

    Product(int productId, String productName, int quantity, float price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return new String(
                "Product ID: " + productId
                        + "\nProduct Name: " + productName
                        + "\nQuantity: " + quantity
                        + "\nPrice: " + price
        );
    }
}
