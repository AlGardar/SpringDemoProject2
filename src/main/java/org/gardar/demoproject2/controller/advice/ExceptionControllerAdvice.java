package org.gardar.demoproject2.controller.advice;

import org.gardar.demoproject2.exception.NotEnoughMoneyException;
import org.gardar.demoproject2.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(NotEnoughMoneyException exception) {
        System.out.println(exception.getMessage());
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not Enough money to make payment");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
