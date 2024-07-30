import javax.swing.plaf.ProgressBarUI;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product(121, "Asus TUF A17 Laptop", 1, 63999.99f));
        inventory.addProduct(new Product(122, "Poco X2 Smartphone", 1, 23999.99f));
        inventory.addProduct(new Product(131, "CASIO CTK-7300 IN", 1, 19999.99f));
        inventory.addProduct(new Product(132, "American Tourister", 2, 5999.99f));

        inventory.removeProduct(132);
        inventory.showProducts();

    }
}