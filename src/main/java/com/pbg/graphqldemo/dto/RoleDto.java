package com.pbg.graphqldemo.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class RoleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7598578112022309585L;
	
	private Long id;
	private String name;
	private String dn;
	private Set<ApplicationDto> applications = new HashSet<>();
	
}
