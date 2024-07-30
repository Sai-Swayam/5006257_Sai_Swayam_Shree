import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Inventory {
    HashMap<Integer,Product> products = new HashMap<>();

    public void addProduct(Product p) {
        this.products.put(p.productId, p);
        System.out.println("Added the following product\n" + p);
    }

    public void removeProduct(int id) {
        System.out.println("Removed the following product\n" + products.get(id));
        this.products.remove(id);
    }

    public void searchProduct(int id) {
        if(this.products.containsKey(id)){
            System.out.println("Yes, the product is present in the inventory");
        }
    }

    public void showProducts() {
        Iterator<Map.Entry<Integer,Product>> iterator = this.products.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Product> entry = iterator.next();
            System.out.println("Products\n" + "-----------------\n" + entry.getValue());
        }
    }
}
