package kh.edu.cstad.bankingapi.repository;

import kh.edu.cstad.bankingapi.domain.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {
}
