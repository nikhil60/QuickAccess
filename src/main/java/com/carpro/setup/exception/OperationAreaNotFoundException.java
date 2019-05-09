package com.carpro.setup.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class OperationAreaNotFoundException extends RuntimeException{
	public OperationAreaNotFoundException(String message) {
		super(message);
	}
}
