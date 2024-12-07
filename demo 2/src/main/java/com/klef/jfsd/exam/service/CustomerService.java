package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<>();
    private Long nextId = 1L;

    // Fetch all customers
    public List<Customer> getAllCustomers() {
        return customers;
    }

    // Save a new customer
    public Customer saveCustomer(Customer customer) {
        customer.setId(nextId++);
        customers.add(customer);
        return customer;
    }
}
