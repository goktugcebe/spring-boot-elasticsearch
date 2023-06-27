package com.example.springbootelasticsearch.repository;

import com.example.springbootelasticsearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {
    List<Customer> findByFirstname(String firstName);
}
