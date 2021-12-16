package com.gray.starter.springbootbeginprjct.services;


import com.gray.starter.springbootbeginprjct.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<UserDto> saveUser(UserDto userDto);
}
