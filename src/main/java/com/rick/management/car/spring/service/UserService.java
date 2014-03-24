package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rick.management.car.spring.dao.UserDao;
import com.rick.management.car.spring.persit.domain.Quyen;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.persit.repositories.UserRepo;
@Service
public class UserService extends BaseService implements IUserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRepo userRepo;
	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return userDao.create(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public boolean doLogin(String username, String password) {
		return userDao.doLogin(username, password);
	}

	@Override
	public Quyen getQuyenById(int id) {
		// TODO Auto-generated method stub
		return userDao.getQuyenById(id);
	}

}
