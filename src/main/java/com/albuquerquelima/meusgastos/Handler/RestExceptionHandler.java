package com.albuquerquelima.meusgastos.Handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.albuquerquelima.meusgastos.Common.ConversorData;
import com.albuquerquelima.meusgastos.Domain.exception.ResourceBadRequestException;
import com.albuquerquelima.meusgastos.Domain.exception.ResourceNotFoundException;
import com.albuquerquelima.meusgastos.Domain.model.ErroResposta;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErroResposta> handlerResourceNotFoundException(ResourceNotFoundException ex){

        String dataHora = ConversorData.converterDataParaDataEHora(new Date());
        
        ErroResposta erro = new ErroResposta(dataHora, HttpStatus.NOT_FOUND.value(), "Not Found",  ex.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
    }

     @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<ErroResposta> handlerResourceBadRequestExecption(ResourceBadRequestException ex){

        String dataHora = ConversorData.converterDataParaDataEHora(new Date());
        
        ErroResposta erro = new ErroResposta(dataHora, HttpStatus.BAD_REQUEST.value(), "Bad Request",  ex.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroResposta> handlerRequestExecption(Exception ex){

        String dataHora = ConversorData.converterDataParaDataEHora(new Date());
        
        ErroResposta erro = new ErroResposta(dataHora, HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error",  ex.getMessage());

        return new ResponseEntity<>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    
}
