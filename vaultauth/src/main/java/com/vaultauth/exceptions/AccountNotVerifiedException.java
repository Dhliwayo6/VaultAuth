package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;

public class AccountNotVerifiedException extends RuntimeException{
    public AccountNotVerifiedException() {
        super(ErrorMessages.ACCOUNT_NOT_VERIFIED.getMessage());
    }
}
