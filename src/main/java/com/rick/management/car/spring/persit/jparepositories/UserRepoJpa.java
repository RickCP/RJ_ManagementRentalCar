package com.rick.management.car.spring.persit.jparepositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rick.management.car.spring.persit.JpaBaseRepo;
import com.rick.management.car.spring.persit.domain.*;

public interface UserRepoJpa extends JpaBaseRepo<User, Integer>, UserCustomRepo {
	
	public User findByuserName(String userName);
	
	@Query("SELECT u FROM User u ")
	public List<User> findAll();

	public static final String FIND_USER_BY_USERNAME_PASSWORD="SELECT u FROM User u WHERE u.userName = :userName AND u.password = :password";
	
	@Query(FIND_USER_BY_USERNAME_PASSWORD)
	public User findUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
			
	
}
