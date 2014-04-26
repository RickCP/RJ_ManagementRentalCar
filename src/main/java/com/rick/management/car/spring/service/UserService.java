package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.persit.jparepositories.UserRepoJpa;

@Service
public class UserService extends BaseService implements IUserService {
	@Autowired
	private UserRepoJpa userRepoJpa;

	@Override
	public User create(User user) {
		return userRepoJpa.save(user);
	}

	@Override
	public List<User> findAll() {

		return userRepoJpa.findAll();
	}

	@Override
	public User findById(int id) {

		return userRepoJpa.findOne(id);
	}

	@Override
	public User findUserByUsernameAndPassword(String userName, String password) {
		return userRepoJpa.findUserByUserNameAndPassword(userName, password);
	}

}
