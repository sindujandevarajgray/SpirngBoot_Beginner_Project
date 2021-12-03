package com.gray.starter.springbootbeginprjct.repositories;

import com.gray.starter.springbootbeginprjct.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/2/2021
 * Time: 9:12 AM
 * SpringBoot-BeginPrjct
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
