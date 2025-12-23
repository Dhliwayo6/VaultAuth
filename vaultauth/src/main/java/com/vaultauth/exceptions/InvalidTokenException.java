package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidTokenException extends RuntimeException{
    public InvalidTokenException() {
        super(ErrorMessages.INVALID_TOKEN.getMessage());
    }
}
