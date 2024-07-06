package com.sbenitez.app.infraestructure.exception.own;

import com.sbenitez.app.infraestructure.exception.structure.ErrorCode;

import lombok.Getter;

@Getter
public class BadCredentialException extends RuntimeException {
    /** Personalize menssage error. */
    private final String messageKey;
    /** Personalize code error. */
    private final String code;

    /**
     * BadCredentialException, use the values define on enum {@code ErrorCode}.
     * 
     * @param code Error code to use on exception define on enum {@code ErrorCode}.
     */
    public BadCredentialException(ErrorCode code) {
        super(code.getCode());
        this.messageKey = code.getMessageKey();
        this.code = code.getCode();
    }

    /**
     * Use the default value define to BadCredentialException on enum
     * {@code ErrorCode} and add a personalize message to show the error.
     * 
     * @param message Personalized message error.
     */
    public BadCredentialException(final String message) {
        super(message);
        this.messageKey = ErrorCode.BAD_CREDENTIALS.getMessageKey();
        this.code = ErrorCode.BAD_CREDENTIALS.getCode();
    }
}
