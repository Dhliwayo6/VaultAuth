package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;

public class AccountAlreadyVerifiedException extends RuntimeException{
    public AccountAlreadyVerifiedException() {
        super(ErrorMessages.ACCOUNT_ALREADY_VERIFIED.getMessage());
    }
}
