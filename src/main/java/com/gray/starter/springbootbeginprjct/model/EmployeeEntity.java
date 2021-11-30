package com.gray.starter.springbootbeginprjct.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 10:36 AM
 * SpringBoot-BeginPrjct
 */

@Entity
@Getter
@Setter
@Table(name = "employee",uniqueConstraints = @UniqueConstraint(name = "employee_name",columnNames = "name"))
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_Id")
    private OranzationEntity oranzationEntity;
}
