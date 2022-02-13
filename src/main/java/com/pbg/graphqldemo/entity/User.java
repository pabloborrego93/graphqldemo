package com.pbg.graphqldemo.entity;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class User {

	@Id private Long id;
	private String email;
	private Instant born;

	@ManyToMany
	private Set<Role> roles = new HashSet<>();
	
}
