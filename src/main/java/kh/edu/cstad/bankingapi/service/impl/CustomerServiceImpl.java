package kh.edu.cstad.bankingapi.service.impl;

import kh.edu.cstad.bankingapi.domain.Customer;
import kh.edu.cstad.bankingapi.dto.CreateCustomerRequest;
import kh.edu.cstad.bankingapi.dto.CustomerResponse;
import kh.edu.cstad.bankingapi.mapper.CustomerMapper;
import kh.edu.cstad.bankingapi.repository.CustomerRepository;
import kh.edu.cstad.bankingapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public List<CustomerResponse> findAllCustomer() {
        List<Customer> customers = customerRepository.findAll();

        // logic find all
        return customerMapper.toCustomerResponseList(customers);
    }

    @Override
    public CustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest) {

        if(customerRepository.existsByEmail(createCustomerRequest.email())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email already exists");
        }

        if(customerRepository.existsByPhoneNumber(createCustomerRequest.phoneNumber())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Phone number already exists");
        }

        Customer customer = customerMapper.toCustomer(createCustomerRequest);
        customer.setIsDeleted(false);

        customerRepository.save(customer);

        return customerMapper.toCustomerResponse(customer);

//        logic create customer
//        return CustomerResponse.builder()
//                .uuid(customer.getUuid())
//                .fullName(customer.getFullName())
//                .gender(customer.getGender())
//                .email(customer.getEmail())
//                .phoneNumber(customer.getPhoneNumber())
//                .build();
    }
}
