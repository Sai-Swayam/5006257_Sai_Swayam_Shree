import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //unsorted array for linear search
        ArrayList<Product> p1 = new ArrayList<>();
        p1.add(new Product(4, "Laptop"));
        p1.add(new Product(1, "Oven"));
        p1.add(new Product(3, "Pencil"));
        p1.add(new Product(8, "Pen"));
        p1.add(new Product(7, "Bike"));
        p1.add(new Product(19, "Car"));
        p1.add(new Product(69, "Smartphone"));

        //sorted array for binary search
        ArrayList<Product> p2 = new ArrayList<>();
        p2.add(new Product(1, "Laptop"));
        p2.add(new Product(2, "Oven"));
        p2.add(new Product(3, "Pencil"));
        p2.add(new Product(4, "Pen"));
        p2.add(new Product(5, "Bike"));
        p2.add(new Product(6, "Car"));
        p2.add(new Product(7, "Smartphone"));

//        linearSearch(79, p1);
        binarySearch(3, p2);
    }

    //Linear Search
    public static void linearSearch(int id, ArrayList<Product> p) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).productId == id) {
                System.out.println("Product found at index " + i);
                return;
            }
        }
        System.out.println("Product not found");
    }

    //Binary Search
    public static void binarySearch(int id, ArrayList<Product> p) {
        int i = 0, j = p.size() - 1, mid = p.size() / 2;
        while (i <= j) {
            mid = (i + j) / 2;
            if (p.get(mid).productId == id) {
                System.out.println(p.get(mid).productId);
                System.out.println("Product found at index " + mid);
                return;
            } else if (id <= p.get(mid).productId) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        System.out.println("Product not found");
        return;
    }
}