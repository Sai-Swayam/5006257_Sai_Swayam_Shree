public class Main {
    private static final int MAX = 9;
    private static int index = 0;

    public static void add(Employee e, Employee[] ar) {
        ar[index] = e;
        index++;
    }

    public static void delete(int id, Employee[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == null) break;
            if (ar[i].employeeId == id && i != ar.length - 1) {
                for (int j = i + 1; j < ar.length; j++) {
                    ar[j - 1] = ar[j];
                }
            } else if (ar[i].employeeId == id && i == ar.length - 1) ar[i] = null;
            else if (ar[i] == null) break;
        }
    }

    public static void search(int id, Employee[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].employeeId == id) {
                System.out.println("Employee " + ar[i].name + " found at index " + i);
                break;
            }
        }
    }

    public static void traverse(Employee[] ar) {
        for (Employee e : ar) System.out.println(e);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[MAX];
        add(new Employee(9295, "Sai", "SDE", 90000f), employees);
        add(new Employee(1234, "Ravi", "Manager", 120000f), employees);
        add(new Employee(5678, "Geeta", "Developer", 80000f), employees);
        add(new Employee(9876, "Krishna", "Tester", 75000f), employees);
        add(new Employee(3456, "Ram", "Analyst", 65000f), employees);
        add(new Employee(7890, "Sita", "Designer", 85000f), employees);


        delete(9295, employees);

        search(5678, employees);
        traverse(employees);

    }
}