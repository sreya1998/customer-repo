package sms.service;


import java.util.List;

import sms.entity.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	
	Customer saveCustomer(Customer Customer);
	
	Customer getCustomerById(Long id);
	
	Customer updateCustomer(Customer Customer);
	
	void deleteCustomerById(Long id);
}
