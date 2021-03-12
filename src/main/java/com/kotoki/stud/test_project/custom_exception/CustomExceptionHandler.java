package com.kotoki.stud.test_project.custom_exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

    @RestControllerAdvice
public class CustomExceptionHandler {

        @ExceptionHandler({Exception.class})
        @ResponseStatus
        public final String serverErrorHandler(Exception ex) {
            return ex.getMessage();
        }

        @ExceptionHandler({SearchException.class})
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        public final String badRequestHandler(SearchException ex) {
            return ex.getMessage();
        }
}
