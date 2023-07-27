package br.com.testes.api.service.exception;

public class IntegrityViolationException extends RuntimeException{

    public IntegrityViolationException(String message) {
        super(message);
    }
}
