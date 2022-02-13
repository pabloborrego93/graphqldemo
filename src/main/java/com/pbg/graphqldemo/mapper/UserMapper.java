package com.pbg.graphqldemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import com.pbg.graphqldemo.dto.UserDto;
import com.pbg.graphqldemo.entity.User;

@Mapper(
	componentModel = "spring",
	nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
	unmappedSourcePolicy = ReportingPolicy.IGNORE,
	unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserMapper {

	UserDto toDto(User user);
	
}
