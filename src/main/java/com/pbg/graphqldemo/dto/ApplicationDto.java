package com.pbg.graphqldemo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ApplicationDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5796711894102216629L;

	private Long id;
	private String name;
	
}
