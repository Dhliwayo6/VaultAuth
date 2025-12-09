package com.vaultauth.exceptions;

import com.vaultauth.enums.ErrorMessages;

public class VerificationTokenExpiredException extends RuntimeException{
    public VerificationTokenExpiredException() {
        super(ErrorMessages.VERIFICATION_TOKEN_EXPIRED.getMessage());
    }
}
