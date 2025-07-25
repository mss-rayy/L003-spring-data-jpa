package kh.edu.cstad.bankingapi.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import kh.edu.cstad.bankingapi.domain.Customer;
import kh.edu.cstad.bankingapi.dto.CreateCustomerRequest;
import kh.edu.cstad.bankingapi.dto.CustomerResponse;
import kh.edu.cstad.bankingapi.dto.UpdateCustomerRequest;
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
    public CustomerResponse createCustomer(@Valid @RequestBody CreateCustomerRequest createCustomerRequest) {
        System.out.println("TEST" + createCustomerRequest);
        return customerService.createCustomer(createCustomerRequest);
    }

    @PatchMapping("/{email}")
    public CustomerResponse updateCustomer(
            @PathVariable String email,
            @RequestBody UpdateCustomerRequest updateCustomerRequest
    ){
        return customerService.updateCustomerByEmail(email,updateCustomerRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{uuid}")
    public void deleteCustomerByUuid(@PathVariable String uuid) {
        customerService.deleteCustomerByUuid(uuid);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{phoneNumber}")
    public void disableByPhoneNumber(@PathVariable String phoneNumber) {
        customerService.disableByPhoneNumber(phoneNumber);
    }
}
