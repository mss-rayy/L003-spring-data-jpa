package kh.edu.cstad.bankingapi.dto;

public record CreateCustomerRequest(
        String fullName,
        String gender,
        String email,
        String phoneNumber
) {
}
