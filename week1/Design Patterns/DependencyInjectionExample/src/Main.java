public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(new CustomerRepositoryImpl());
        customerService.findById(9295);

    }
}