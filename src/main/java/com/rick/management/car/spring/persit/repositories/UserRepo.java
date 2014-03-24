package com.rick.management.car.spring.persit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.rick.management.car.spring.persit.BaseRepo;
import com.rick.management.car.spring.persit.domain.User;

public interface UserRepo extends BaseRepo<User, Integer>, UserCustomRepo {
	@Query("SELECT u FROM User u ")
	public List<User> findAll();
	
	@Query("SELECT u FROM User u JOIN DmQuyen dq ON u.quanliId = dq.quanliId"
			+ " JOIN Quyen q ON dq.quyenId = q.quyenId WHERE q.quyenId = :quyenId")
	public List<User> findByQuyenId(Integer quyenId);
}
