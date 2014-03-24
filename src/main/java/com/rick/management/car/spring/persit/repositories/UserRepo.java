package com.rick.management.car.spring.persit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.rick.management.car.spring.persit.BaseRepo;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.persit.domain.*;


public interface UserRepo extends BaseRepo<User, Integer>, UserCustomRepo {
	@Query("SELECT u FROM User u ")
	public List<User> findAll();
	
	
//	public List<User> findByQuyenId(Integer quyenId);
}
