package com.gray.starter.springbootbeginprjct.model;

import com.gray.starter.springbootbeginprjct.Utils.Transform;
import com.gray.starter.springbootbeginprjct.dto.UserDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity implements Transform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String country;

    private String username;

    private String password;

}