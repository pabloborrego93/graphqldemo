package com.pbg.graphqldemo.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class UserDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6760033008338436892L;
	
	private Long id;
	private String email;
	private Instant born;

	private Set<RoleDto> roles = new HashSet<>();
	
}
