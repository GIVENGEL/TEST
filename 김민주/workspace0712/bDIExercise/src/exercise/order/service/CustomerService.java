package exercise.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exercise.order.domain.Customer;

public interface CustomerService {
	
	
	void saveCustomer(Customer customer);
	void deleteCustomer(long id);
}
