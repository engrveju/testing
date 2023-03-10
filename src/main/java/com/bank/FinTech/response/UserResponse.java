package com.bank.FinTech.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    String firstName;
    String lastName;
    String bvn;
    String email;
    String phoneNumber;
}
