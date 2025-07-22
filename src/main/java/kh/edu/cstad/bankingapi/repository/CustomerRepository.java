package kh.edu.cstad.bankingapi.repository;

import kh.edu.cstad.bankingapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, String > {

//    find all
    List<Customer> findAll();

    Boolean existsByEmail(String email);

    Boolean existsByPhoneNumber (String phoneNumber);
}
