import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void bubbleSort(ArrayList<Order> ar) {
        for (int i = 0; i < ar.size() - 1; i++) {
            int noSwap = 0; // to check whether swap happened in first iteration
            for (int j = 0; j < ar.size() - i - 1; j++) {
                if (ar.get(j).totalPrice > ar.get(j + 1).totalPrice) {
                    Order temp = ar.get(j);
                    ar.set(j, ar.get(j + 1));
                    ar.set(j + 1, temp);
                    noSwap = 1;
                }
// if no swap occured in the current iteration, no need to continue as already sorted
            }
            if (noSwap == 0) break;
            System.out.println("runs");
        }
    }

    public static void quickSort(ArrayList<Order> ar, int l, int r) {
        if (l < r) {
            int pivot = partition(ar, l, r);
            quickSort(ar, l, pivot - 1);
            quickSort(ar, pivot + 1, r);
        }
    }

    public static int partition(ArrayList<Order> ar, int l, int r) {
        int pivot = r;
        int i = l, j = l;
        for (; j < r; j++) {
            if (ar.get(j).totalPrice <= ar.get(pivot).totalPrice) {
                Order temp = ar.get(j);
                ar.set(j, ar.get(i));
                ar.set(i, temp);
                i++;
            }
        }
        Order temp = ar.get(i);
        ar.set(i, ar.get(pivot));
        ar.set(pivot, temp);
        return i;
    }


    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(56, "Sai", 19000f));
        orders.add(new Order(21, "Sonu", 21f));
        orders.add(new Order(33, "Soham", 545.32f));
        orders.add(new Order(11, "Vaibhav", 234f));
        orders.add(new Order(77, "Jyoti", 8817f));

//        bubbleSort(orders);
//        for (Order od : orders) System.out.println(od);

        quickSort(orders, 0, orders.size() - 1);
        System.out.println(orders);
    }
}