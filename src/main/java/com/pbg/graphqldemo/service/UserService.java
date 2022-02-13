package com.pbg.graphqldemo.service;

import org.springframework.data.domain.Page;

import com.pbg.graphqldemo.dto.UserDto;
import com.pbg.graphqldemo.exception.NotFoundException;

public interface UserService {

	UserDto user(Long id) throws NotFoundException;
	Page<UserDto> findAll(Integer page, Integer size);
 	
}
