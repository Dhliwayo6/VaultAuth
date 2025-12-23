package com.vaultauth.enums;

public enum ErrorMessages {
    USER_NOT_FOUND("User not found!"),
    ACCOUNT_NOT_VERIFIED("Account not verified, verify account before logging in"),
    EMAIL_ALREADY_EXISTS("The email you entered already exists"),
    INVALID_TOKEN("Invalid token"),
    ACCOUNT_ALREADY_VERIFIED("Account has already been verified"),
    VERIFICATION_TOKEN_EXPIRED("The verification token you entered has expired"),
    VALIDATION_ERROR("Validation error"),
    INVALID_CREDENTIALS("Invalid username or password");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
