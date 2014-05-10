package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.LoaiXe;
import com.rick.management.car.spring.persit.jparepositories.LoaiXeRepo;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Service
public class LoaiXeService implements ILoaiXeService {
	@Autowired
	private LoaiXeRepo loaiXeRepo;

	@Override
	public List<LoaiXe> findAll() {
		
		return loaiXeRepo.findAll();
	}

	@Override
	public LoaiXe create(LoaiXe loaiXe) {
		
		return loaiXeRepo.save(loaiXe);
	}
	
}
