package com.sbenitez.app.infraestructure.exception.structure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
/**
 * Class to manage response errors objects.
 */
public class Error {
    /** Personalize error code */
    private String errorCode;
    /** Personalize error message */
    private String message;
    /** Http response code */
    private Integer httpCode;
    /** Endpoint Called */
    @Accessors(chain = true)
    private String url;
    /** Http method used */
    @Accessors(chain = true)
    private String method;

}
