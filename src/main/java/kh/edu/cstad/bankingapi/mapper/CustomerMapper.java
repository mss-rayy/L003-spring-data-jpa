package kh.edu.cstad.bankingapi.mapper;

import kh.edu.cstad.bankingapi.domain.Customer;
import kh.edu.cstad.bankingapi.dto.CreateCustomerRequest;
import kh.edu.cstad.bankingapi.dto.CustomerResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

//    Domain -> DTO
    // 1 . return type
    // 2. parameter
    CustomerResponse toCustomerResponse(Customer customer);

//    List<Domain> -> List<DTO>
    List<CustomerResponse> toCustomerResponseList(List<Customer> customers);

//    DTO -> Domain
    Customer toCustomer(CreateCustomerRequest request);

}
