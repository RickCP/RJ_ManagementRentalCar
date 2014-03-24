package com.rick.management.car.spring.persit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.rick.management.car.spring.persit.BaseRepo;
import com.rick.management.car.spring.persit.domain.User;

public interface UserRepo extends BaseRepo<User, Integer>, UserCustomRepo {
	@Override
	 @Query("SELECT u FROM User u ")
	public List<User> findAll();
}
