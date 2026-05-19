package com.mohamed.firstrestapi.shared.exception;

import com.mohamed.firstrestapi.product.exception.ProductNotFoundException;
import com.mohamed.firstrestapi.shared.api.response.ErrorMessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFoundException(
            ProductNotFoundException exception
    ) {

        ErrorMessageResponse response =
                new ErrorMessageResponse(exception.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}