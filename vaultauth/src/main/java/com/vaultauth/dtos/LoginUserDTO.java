package com.vaultauth.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserDTO {
    private String email;
    private String password;
}
