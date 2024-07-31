public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository cr) {
        this.customerRepository = cr;
    }

    public void findById(int id) {
        customerRepository.findCustomerById(id);
    }
}
