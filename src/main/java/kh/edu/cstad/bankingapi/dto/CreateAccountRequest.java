package kh.edu.cstad.bankingapi.dto;

public record CreateAccountRequest(

        String accountNumber,
        String accountName,
        String balance,
        String currency,
        String accountType
) {
}
