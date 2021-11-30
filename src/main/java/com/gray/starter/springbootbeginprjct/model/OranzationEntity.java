package com.gray.starter.springbootbeginprjct.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 11/30/2021
 * Time: 10:22 AM
 * SpringBoot-BeginPrjct
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "organization",
        uniqueConstraints = @UniqueConstraint(name = "organization_name",columnNames = "name")
)

public class OranzationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orgId;

    @Column(name = "name")
    private String name;
}
