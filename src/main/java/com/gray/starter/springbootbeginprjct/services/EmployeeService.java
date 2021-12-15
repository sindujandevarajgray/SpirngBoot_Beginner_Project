package com.gray.starter.springbootbeginprjct.services;

import com.gray.starter.springbootbeginprjct.dto.CustomPageDto;
import com.gray.starter.springbootbeginprjct.dto.EmployeeDto;
import com.gray.starter.springbootbeginprjct.model.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 9:17 AM
 * SpringBoot-BeginPrjct
 */
public interface EmployeeService {
    ResponseEntity<EmployeeDto> save(int organizationId, EmployeeDto employeeDto);

    ResponseEntity<EmployeeDto> update(int organizationId, EmployeeDto employeeDto);

    ResponseEntity<EmployeeDto> findByName(String name);

    ResponseEntity<List<EmployeeDto>> findByCounrtry(String country);

    ResponseEntity<EmployeeDto> findByEmpIdAndAndOranzationEntity_OrgId(int empId, int orgId);

    ResponseEntity<CustomPageDto<EmployeeDto>> findAllWithPagination(int page, int size, int organizationId);
}
