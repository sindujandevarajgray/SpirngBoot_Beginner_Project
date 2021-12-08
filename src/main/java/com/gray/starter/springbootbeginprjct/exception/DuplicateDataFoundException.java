package com.gray.starter.springbootbeginprjct.exception;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/5/2021
 * Time: 1:54 PM
 * SpringBoot-BeginPrjct
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DuplicateDataFoundException extends RuntimeException{

    private final String message;

    private final String variable;
}
