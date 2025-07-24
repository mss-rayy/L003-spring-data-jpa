package kh.edu.cstad.bankingapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record CreateCustomerRequest(

        @NotBlank (message = "Full name is required!!")
        String fullName,

        @NotBlank(message = "Gender is required!!")
        String gender,

        @NotBlank(message = "Email is required!!")
        String email,

        @NotBlank(message = "Phone number is required!!")
        String phoneNumber
) {
}
