package kh.edu.cstad.bankingapi.repository;

import kh.edu.cstad.bankingapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer, String > {

//    find all
    List<Customer> findAll();

    Boolean existsByEmail(String email);

    Boolean existsByPhoneNumber (String phoneNumber);

    Optional<Customer> findByEmail(String email);

    Optional<Customer> findCustomerByUuid(String uuid);
}
