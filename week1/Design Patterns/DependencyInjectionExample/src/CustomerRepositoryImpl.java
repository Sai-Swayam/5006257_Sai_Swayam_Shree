public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public void findCustomerById(int id) {
        System.out.println("Finding ID " + id + "....");
    }
}
