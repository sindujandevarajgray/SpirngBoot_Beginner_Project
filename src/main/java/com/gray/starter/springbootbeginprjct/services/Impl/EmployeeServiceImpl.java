package com.gray.starter.springbootbeginprjct.services.Impl;

import com.gray.starter.springbootbeginprjct.dto.EmployeeDto;
import com.gray.starter.springbootbeginprjct.exception.DataNotFoundException;
import com.gray.starter.springbootbeginprjct.exception.DuplicateDataFoundException;
import com.gray.starter.springbootbeginprjct.exception.GeneralException;
import com.gray.starter.springbootbeginprjct.model.EmployeeEntity;
import com.gray.starter.springbootbeginprjct.model.OranzationEntity;
import com.gray.starter.springbootbeginprjct.repositories.EmployeeRepository;
import com.gray.starter.springbootbeginprjct.repositories.OrgnizationRepository;
import com.gray.starter.springbootbeginprjct.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
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

    @Value("${error.message.not.found}")
    String messageNotFound;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, OrgnizationRepository orgnizationRepository) {
        this.employeeRepository = employeeRepository;
        this.orgnizationRepository = orgnizationRepository;
    }

    @Override
    public ResponseEntity<EmployeeDto> save(int organizationId, EmployeeDto employeeDto) {
        /*
        *OLD WAY
        *
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
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(save);*/

        /*
            if (!organizationRepository.existsById(organizationsId)) {
                log.error("Organization not found");
                throw new DataNotFoundException("Organization not found", String.valueOf(organizationsId));
            }
*/

        OranzationEntity oranzation = orgnizationRepository.findById(organizationId).orElseThrow(() ->
                new DataNotFoundException(messageNotFound, String.valueOf(organizationId)));

        try {

            EmployeeEntity entity = new EmployeeEntity();
            BeanUtils.copyProperties(employeeDto, entity);
            entity.setOranzationEntity(oranzation);

            employeeRepository.save(entity);

        } catch (DataIntegrityViolationException e) {
            log.error(e.getLocalizedMessage());
            throw new DuplicateDataFoundException("Duplicate data found", employeeDto.getEmail());
        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
            throw new GeneralException("General error while saving data", e.getLocalizedMessage());
        }

        return ResponseEntity.status(HttpStatus.OK).body(employeeDto);
    }

    @Override
    public ResponseEntity<EmployeeDto> findByName(String name) {
        return null;
    }

    @Override
    public ResponseEntity<EmployeeDto> findByCounrtry(String country) {
        return null;
    }

}
