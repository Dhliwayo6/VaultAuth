package com.vaultauth.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyUserDTO {
    private String email;
    private String verificationCode;
}
