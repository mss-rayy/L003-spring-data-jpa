package kh.edu.cstad.bankingapi.dto;

import lombok.Builder;

@Builder
public record CustomerResponse(
        String id,
        String fullName,
        String email,
        String phoneNumber,
        String gender
) {
}
