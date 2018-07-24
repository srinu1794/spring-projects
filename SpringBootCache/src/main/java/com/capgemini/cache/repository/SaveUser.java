package com.capgemini.cache.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.cache.model.User;

@Repository
public class SaveUser {

	@Autowired
	UserRepository userRepository;

	@PostConstruct
	public void load() {

		List<User> userList = getList();

		userRepository.saveAll(userList);
	}

	private List<User> getList() {
		List<User> userList = new ArrayList<>();

		userList.add(new User("vinay", "cap", 123L));
		userList.add(new User("anu", "cap", 123L));

		return userList;
	}

}
