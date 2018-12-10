package com.mydzone.microservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {
    /**
	 * Default serialization ID
	 */
	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundException() {
    }
	
    public ProductNotFoundException(String message) {
        super(message);
    }
    
    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ProductNotFoundException(Throwable cause) {
        super(cause);
    }
}
