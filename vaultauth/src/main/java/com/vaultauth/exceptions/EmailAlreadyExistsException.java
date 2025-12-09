package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;

public class EmailAlreadyExistsException extends RuntimeException{
    public EmailAlreadyExistsException() {
        super(ErrorMessages.EMAIL_ALREADY_EXISTS.getMessage());
    }
}
