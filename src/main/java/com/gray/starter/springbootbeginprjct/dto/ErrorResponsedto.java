package com.gray.starter.springbootbeginprjct.dto;

import lombok.Builder;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/3/2021
 * Time: 9:51 AM
 * SpringBoot-BeginPrjct
 */

@Builder
public class ErrorResponsedto {
    private String errorCode;
    private String message;
    private String varaible;
}
