package com.gray.starter.springbootbeginprjct.repositories;

import com.gray.starter.springbootbeginprjct.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 12/2/2021
 * Time: 9:12 AM
 * SpringBoot-BeginPrjct
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    //    JPA Query
    Optional<EmployeeEntity> findByName(String name);

    Optional<List<EmployeeEntity>> findByNameAndCountry(String name, String country);

    Optional<EmployeeEntity> findByCountry(String country);

    //    JPQL Query
    @Query(value = "SELECT e FROM EmployeeEntity e WHERE e.name=:name AND e.country=:country")
    Optional<EmployeeEntity> searchByName(String name, String country);

    @Query(value = "SELECT e FROM EmployeeEntity e WHERE e.name=:name AND e.country=:country")
    Optional<EmployeeEntity> searchByName(String name);

//    Native Query

    @Query(value = "SELECT * FROM Employee e WHERE  e.name=:name AND e.country=:country", nativeQuery = true)
    Optional<EmployeeEntity> nativeSearchByNameAndCountry();

    @Query(value = "SELECT e.name AS employeeName, o.name AS oraganizationName FROM " +
            "employee e INNER JOIN  organization o ON e.organization_id = o.org_id", nativeQuery = true)
    List<EmployeeAndOrganization> searchEmployeeAndOrgnization();

    interface EmployeeAndOrganization {
        String getEmployeeName();

        String getOraginzationName();
    }
}
