package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.persit.jparepositories.HangXeRepo;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Service
public class HangXeService  implements IHangXeService{
	@Autowired
	private HangXeRepo hangXeRepo;
	@Override
	public List<HangXe> findAll() {
		
		return hangXeRepo.findAll();
	}
	@Override
	public HangXe findByhangXeId(Integer hangXeId) {

		return hangXeRepo.findByhangXeId(hangXeId);
	}

}
