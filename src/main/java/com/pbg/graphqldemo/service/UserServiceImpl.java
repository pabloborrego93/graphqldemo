package com.pbg.graphqldemo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.pbg.graphqldemo.dto.UserDto;
import com.pbg.graphqldemo.exception.NotFoundException;
import com.pbg.graphqldemo.mapper.UserMapper;
import com.pbg.graphqldemo.repository.UserRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService, GraphQLQueryResolver {

	private final UserRepository userRepository;
	private final UserMapper userMapper;
	
	@Override
	public Page<UserDto> findAll(Integer page, Integer size) {
		log.info("Retrieving user page {} with size {}", page, size);
		return userRepository
			.findAll(PageRequest.of(page, size))
			.map(userMapper::toDto);
	}

	@Override
	public UserDto user(Long id) throws NotFoundException {
		log.info("Retrieving user with id {}", id);
		return userRepository
			.findById(id)
			.map(userMapper::toDto)
			.orElseThrow(() -> {
				String errorMessage = String.format("User with id %s not found", id);
				log.error(errorMessage);
				return new NotFoundException(errorMessage);
			});
	}
	
}
