package com.sbenitez.app.infraestructure.exception.structure;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    /**
     * Error code: GC-0001
     * Message: GENERIC ERROR
     */
    GENERIC_ERROR("GC-0001", "GENERIC ERROR"),

    /**
     * Error code: GC-0002
     * Message: ERROR, ALREADY EXISTS
     */
    ENTITY_EXISTS("GC-0002", "ERROR, ENTITY ALREADY EXISTS"),

    /**
     * Error code: GC-0003
     * Message: ERROR, COULDN'T FOUND ENTITY
     */
    ENTITY_NOT_FOUND("GC-0003", "ERROR, COULDN'T FOUND ENTITY"),

    /**
     * Error code: GC-0004
     * Message: ERROR, BUSINESS RULE HAS BEEN VIOLATED
     */
    BUSINESS_RULE_VIOLATION("GC-0004", "ERROR, BUSINESS RULE HAS BEEN VIOLATED"),

    /**
     * Error code: GC-0005
     * Message: ERROR, BAD CREDENTIALS
     */
    BAD_CREDENTIALS("GC-0005", "ERROR, BAD CREDENTIALS"),

    /**
     * Error code: GC-0006
     * Message: ERROR, BAD FORMAT
     */
    BAD_FORMAT("GC-0006", "ERROR, BAD FORMAT"),

    /**
     * Error code: GC-0007
     * Message: ERROR, NO DATA
     */
    NO_DATA("GC-0007", "ERROR, NO DATA"),

    /**
     * Error code: GC-0008
     * Message: ERROR, NO ACCESS
     */
    NO_ACCESS("GC-0008", "ERROR, NO ACCESS"),

    /**
     * Error code: GC-0009
     * Message: ERROR, TOKEN HAS EXPIRED
     */
    TOKEN_EXPIRED("GC-0009", "ERROR, TOKEN HAS EXPIRED");
    ;

    /**
     * Error code
     */
    private final String code;
    /**
     * Personalized error message
     */
    private final String messageKey;

}
