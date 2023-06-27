package com.example.springbootelasticsearch.controller;

import com.example.springbootelasticsearch.model.Customer;
import com.example.springbootelasticsearch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers){
        this.customerRepository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers(){
        return this.customerRepository.findAll();
    }

    @GetMapping("/findByName/{firstname}")
    public List<Customer> findByName(@PathVariable String firstname){
        return this.customerRepository.findByFirstname(firstname);
    }
}
