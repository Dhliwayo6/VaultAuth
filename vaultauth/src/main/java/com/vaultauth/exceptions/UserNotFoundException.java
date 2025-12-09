package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException() {
        super(ErrorMessages.USER_NOT_FOUND.getMessage());
    }
}
