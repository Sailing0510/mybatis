package mapper;

import java.util.List;

import model.Customer;

public interface CustomerMapper {
	public void add(Customer customer);
	public void update(Customer customer);
	public void delete(int id);
	public Customer load(int id);
	public List<Customer> list();
}
