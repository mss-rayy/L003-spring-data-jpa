package kh.edu.cstad.bankingapi.repository;

import kh.edu.cstad.bankingapi.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    boolean existsByAccountNumber(String accountNumber);
}
