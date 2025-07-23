package kh.edu.cstad.bankingapi.service;


import kh.edu.cstad.bankingapi.dto.CreateCustomerRequest;
import kh.edu.cstad.bankingapi.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {

    /**
     * Find All Customers
     * @return List of Customer Response
     */
    List<CustomerResponse> findAllCustomer();


    /**
     * Create new customer
     * @param createCustomerRequest
     * @return createCustomerRequest
     */
    CustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest);



}
