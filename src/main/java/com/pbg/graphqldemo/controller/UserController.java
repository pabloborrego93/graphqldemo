package com.pbg.graphqldemo.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pbg.graphqldemo.dto.UserDto;
import com.pbg.graphqldemo.exception.NotFoundException;
import com.pbg.graphqldemo.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

	private final UserService userService;
	
	@GetMapping
	public Page<UserDto> findAll(
		@RequestParam(defaultValue = "0", required = false) Integer page,
		@RequestParam(defaultValue = "10", required = false) Integer size
	) {
		return userService.findAll(page, size);
	}
	
	@GetMapping("/{id}")
	public UserDto findOne(
		@PathVariable Long id
	) throws NotFoundException {
		return userService.user(id);
	}
	
}
