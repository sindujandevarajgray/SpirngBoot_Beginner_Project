package com.gray.starter.springbootbeginprjct.services.Impl;

import com.gray.starter.springbootbeginprjct.dto.EmployeeDto;
import com.gray.starter.springbootbeginprjct.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 9:18 AM
 * SpringBoot-BeginPrjct
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public ResponseEntity<EmployeeDto> save(int organizationId, EmployeeDto employeeDto) {
        System.out.println(employeeDto.getAge());
        System.out.println(employeeDto.getEmail());
        System.out.println(employeeDto.getCountry());
        System.out.println(employeeDto.getName());
        System.out.println(employeeDto.getCountry());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeDto);
    }
}
