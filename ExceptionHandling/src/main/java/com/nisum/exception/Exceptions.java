package com.nisum.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class Exceptions extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Exception> handleAllExceptions(Exception ex, WebRequest request) {
		Exception exception = new Exception();
		return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ClassNotFoundException.class)
	public final ResponseEntity<Exception> handleUserNotFoundException(ClassNotFoundException ex, WebRequest request) {
		Exception exception = new Exception(ex.getMessage());
		return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
	}

}