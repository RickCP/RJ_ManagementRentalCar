package com.rick.management.car.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.DatXe;
import com.rick.management.car.spring.persit.jparepositories.DatXeRepo;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Service
public class DatXeService implements IDatXeService {
	
	@Autowired
	private DatXeRepo datXeRepo;

	@Override
	public DatXe create(DatXe xe) {

		return datXeRepo.save(xe);
	}

	@Override
	public DatXe findById(Integer id) {

		return datXeRepo.findBydatXeId(id);
	}

}
