package com.example.login.exception;

import org.springframework.http.HttpStatus;

public class LoginAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public LoginAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public LoginAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
