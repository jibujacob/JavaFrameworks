package com.jj.springdemo.service;

import java.util.List;

import com.jj.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(Customer customer);


}
