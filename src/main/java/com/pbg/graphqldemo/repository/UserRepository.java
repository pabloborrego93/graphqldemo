package com.pbg.graphqldemo.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbg.graphqldemo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
	@EntityGraph(attributePaths = "roles")
	Page<User> findAll(Pageable pageable);
	
	@Override
	@EntityGraph(attributePaths = "roles")
	Optional<User> findById(Long id);
	
}
