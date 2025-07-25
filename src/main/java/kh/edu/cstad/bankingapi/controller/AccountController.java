package kh.edu.cstad.bankingapi.controller;

import kh.edu.cstad.bankingapi.domain.Account;
import kh.edu.cstad.bankingapi.dto.AccountResponse;
import kh.edu.cstad.bankingapi.dto.CreateAccountRequest;
import kh.edu.cstad.bankingapi.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponse createAccount(@RequestBody CreateAccountRequest createAccountRequest){
        return accountService.createAccount(createAccountRequest);
    }

}
