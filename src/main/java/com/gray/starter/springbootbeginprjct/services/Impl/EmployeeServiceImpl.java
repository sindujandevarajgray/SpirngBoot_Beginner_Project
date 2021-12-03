package com.gray.starter.springbootbeginprjct.services.Impl;

import com.gray.starter.springbootbeginprjct.dto.EmployeeDto;
import com.gray.starter.springbootbeginprjct.model.EmployeeEntity;
import com.gray.starter.springbootbeginprjct.repositories.EmployeeRepository;
import com.gray.starter.springbootbeginprjct.repositories.OrgnizationRepository;
import com.gray.starter.springbootbeginprjct.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final OrgnizationRepository orgnizationRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, OrgnizationRepository orgnizationRepository) {
        this.employeeRepository = employeeRepository;
        this.orgnizationRepository = orgnizationRepository;
    }

    @Override
    public ResponseEntity<EmployeeDto> save(int organizationId, EmployeeDto employeeDto) {
        EmployeeDto save = new EmployeeDto();
        try{
            EmployeeEntity employeeEntity = new EmployeeEntity();
            BeanUtils.copyProperties(employeeDto, employeeEntity);
            employeeEntity.setOranzationEntity(orgnizationRepository.getById(organizationId));
            EmployeeEntity entity = employeeRepository.save(employeeEntity);
            BeanUtils.copyProperties(entity, save);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(save);
    }
}
