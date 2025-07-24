package kh.edu.cstad.bankingapi.service.impl;

import kh.edu.cstad.bankingapi.domain.Account;
import kh.edu.cstad.bankingapi.dto.AccountResponse;
import kh.edu.cstad.bankingapi.dto.CreateAccountRequest;
import kh.edu.cstad.bankingapi.repository.AccountRepository;
import kh.edu.cstad.bankingapi.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountResponse createAccount(CreateAccountRequest createAccountRequest) {

        Account account = new Account();

        // Validation account number
        // 1. existed, null => auto generage, set to account
        if(createAccountRequest.accountNumber() == null){
            String accNo;
            // logic
            do{
//                String.format("", )
            }while (accountRepository.existsByAccountNumber(createAccountRequest.accountNumber()));
        }else {
            if(accountRepository.existsByAccountNumber(createAccountRequest.accountNumber())){
                throw  new ResponseStatusException(HttpStatus.CONFLICT,"Account number already exists");
            }

            account.setAccountNumber(createAccountRequest.accountNumber());
        }

        return null;
    }
}
