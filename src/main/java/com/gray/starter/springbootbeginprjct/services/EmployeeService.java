package com.gray.starter.springbootbeginprjct.services;

import com.gray.starter.springbootbeginprjct.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 9:17 AM
 * SpringBoot-BeginPrjct
 */
public interface EmployeeService {
    ResponseEntity<EmployeeDto> save(int organizationId , EmployeeDto employeeDto);
}