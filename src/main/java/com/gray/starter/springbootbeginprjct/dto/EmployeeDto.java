package com.gray.starter.springbootbeginprjct.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 9:15 AM
 * SpringBoot-BeginPrjct
 */
@Getter
@Setter
public class EmployeeDto {
    private int id;
    @Pattern.List({
            @Pattern(regexp = "^([^0-9]*)$", message = "Name must not contains numbers"),
            @Pattern(regexp = "^[^<>%$@#]*$", message = "Name should not be contains special characters")
    }
    )
    @NotEmpty(message = "Name should not be empty")
    @NotNull(message = "Name should not be null")
    private String name;

    @Pattern(regexp = "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$", message = "Invalid Email")
    @NotEmpty(message = "Email should not be empty")
    @NotNull(message = "Email should not be null")
    private String email;

    private String country;

    @Min(value = 18, message = "Age should not be less than 18")
    private int age;


}
