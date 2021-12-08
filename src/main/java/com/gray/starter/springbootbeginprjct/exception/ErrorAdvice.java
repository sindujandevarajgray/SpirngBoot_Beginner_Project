package com.gray.starter.springbootbeginprjct.exception;

import com.gray.starter.springbootbeginprjct.constant.ErrorCodes;
import com.gray.starter.springbootbeginprjct.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleDataNotFoundException(DataNotFoundException ex) {

        ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                .errorCode(ErrorCodes.LS001)
                .message(ex.getMessage())
                .variable(ex.getVariable()).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseDto);

    }

    @ExceptionHandler(DuplicateDataFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleDuplicateDataFoundException(DuplicateDataFoundException ex) {

        ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                .errorCode(ErrorCodes.LS002)
                .message(ex.getMessage())
                .variable(ex.getVariable()).build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseDto);

    }

    @ExceptionHandler(GeneralException.class)
    public ResponseEntity<ErrorResponseDto> handleGeneralException(GeneralException ex) {

        ErrorResponseDto errorResponseDto = ErrorResponseDto.builder()
                .errorCode(ErrorCodes.LS003)
                .message(ex.getMessage())
                .variable(ex.getVariable()).build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseDto);

    }

}