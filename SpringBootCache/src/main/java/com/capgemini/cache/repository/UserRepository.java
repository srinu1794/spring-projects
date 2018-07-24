package com.capgemini.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.cache.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	User findByName(String name);

}
