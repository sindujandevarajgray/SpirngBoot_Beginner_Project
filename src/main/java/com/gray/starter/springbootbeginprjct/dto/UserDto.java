package com.gray.starter.springbootbeginprjct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gray.starter.springbootbeginprjct.Utils.Transform;
import com.gray.starter.springbootbeginprjct.model.UserEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class UserDto implements Transform {

    private String name;

    private String email;

    private String country;

    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

}
