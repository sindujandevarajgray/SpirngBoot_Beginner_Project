package com.gray.starter.springbootbeginprjct.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/3/2021
 * Time: 9:48 AM
 * SpringBoot-BeginPrjct
 */
public class ErrorAdvice extends ResponseEntityExceptionHandler {

    public ResponseEntity<ErrorResponsedto> handleDataNotFoundException(DataNotFoundException ex){

    }
}
