package com.pbg.graphqldemo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7669918173695182797L;

	private final String message;

}
