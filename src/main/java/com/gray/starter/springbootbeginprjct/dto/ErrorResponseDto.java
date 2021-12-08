package com.gray.starter.springbootbeginprjct.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/3/2021
 * Time: 9:51 AM
 * SpringBoot-BeginPrjct
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponseDto {

    private final String message;

    private final String variable;

    @JsonProperty(value = "error_code")
    private final String errorCode;

}