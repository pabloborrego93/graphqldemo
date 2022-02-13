package com.pbg.graphqldemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {

	@Id private Long id;
	private String name;
	
}
