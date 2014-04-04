package com.rick.management.car.spring.persit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rick.management.car.spring.persit.BaseRepo;
import com.rick.management.car.spring.persit.domain.*;

public interface UserRepo extends BaseRepo<User, Integer>, UserCustomRepo {
	@Query("SELECT u FROM User u WHERE u.userName = :userName")
	public User findByUsername(@Param("userName") String userName);
	
	@Query("SELECT u FROM User u ")
	public List<User> findAll();

	public static final String FIND_BY_QUYEN_ID = "SELECT u FROM User u JOIN u.dmQuyens dq JOIN dq.quyen q WHERE q.quyenId = :quyenId AND dq.trangThai = true";

	@Query(FIND_BY_QUYEN_ID)
	public List<User> findByQuyenId(@Param("quyenId") Integer quyenId);
	
	public static final String FIND_USER_BY_USERNAME_PASSWORD="SELECT u FROM User u WHERE u.userName = :userName AND u.password = :password";
	
	@Query(FIND_USER_BY_USERNAME_PASSWORD)
	public User findUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
			
	
	
}
