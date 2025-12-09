package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;

public class InvalidTokenException extends RuntimeException{
    public InvalidTokenException() {
        super(ErrorMessages.INVALID_TOKEN.getMessage());
    }
}
