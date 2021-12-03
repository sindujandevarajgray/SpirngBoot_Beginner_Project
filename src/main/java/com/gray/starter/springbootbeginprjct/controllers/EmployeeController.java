package com.gray.starter.springbootbeginprjct.controllers;

import com.gray.starter.springbootbeginprjct.dto.EmployeeDto;
import com.gray.starter.springbootbeginprjct.services.Impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 9:17 AM
 * SpringBoot-BeginPrjct
 */
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/{organizationId}/employee")
    public ResponseEntity<EmployeeDto> save(
            @PathVariable int organizationId,
            @Valid @RequestBody EmployeeDto employeeDto) {
        ResponseEntity<EmployeeDto> save = employeeService.save(organizationId, employeeDto);
        return save;
    }

    @GetMapping("/{organizationId}/employee/{employeeId}")
    public ResponseEntity<EmployeeDto> getEmployeeDtoResponseEntity(
            @PathVariable int organizationId,
            @PathVariable int employeeId,
            @RequestParam String country) {

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmail("graysteamerzoom@gmail.com");
        employeeDto.setCountry("Sri lanka");
        employeeDto.setId(1);
        employeeDto.setName("Pasindu Raveen");

        return ResponseEntity.status(HttpStatus.OK).body(employeeDto);
    }
}
