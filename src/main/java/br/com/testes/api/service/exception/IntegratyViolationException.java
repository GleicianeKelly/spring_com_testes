package br.com.testes.api.service.exception;

public class IntegratyViolationException extends RuntimeException{

    public IntegratyViolationException(String message) {
        super(message);
    }
}
