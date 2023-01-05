package br.com.tech4pizza.pizzaria.util;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Validacao extends ResponseEntityExceptionHandler  {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        
                List<String> mensagens = ex.getBindingResult()
                                           .getFieldErrors()
                                           .stream()
                                           .map(e -> e.getDe) 
        return super.handleMethodArgumentNotValid(ex, headers, status, request);
    }
 
    
    
}
