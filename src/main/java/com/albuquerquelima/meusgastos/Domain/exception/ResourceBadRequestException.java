package com.albuquerquelima.meusgastos.Domain.exception;

public class ResourceBadRequestException extends RuntimeException {

    public ResourceBadRequestException(String mensagem) {
        super(mensagem);
    }

}
