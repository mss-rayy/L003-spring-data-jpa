package kh.edu.cstad.bankingapi.controller;

import kh.edu.cstad.bankingapi.domain.Customer;
import kh.edu.cstad.bankingapi.dto.CreateCustomerRequest;
import kh.edu.cstad.bankingapi.dto.CustomerResponse;
import kh.edu.cstad.bankingapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping()
    public List<CustomerResponse> findAllCustomers() {
        return customerService.findAllCustomer();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public CustomerResponse createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return customerService.createCustomer(createCustomerRequest);
    }


}
