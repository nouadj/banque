package fr.isen.yncrea.banque.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<String> handleNotFoundException(ArithmeticException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("La ressource demandée n'a pas été trouvée.");
    }
}