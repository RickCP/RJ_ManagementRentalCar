package com.rick.management.car.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.ChiTietDatXe;
import com.rick.management.car.spring.persit.jparepositories.ChiTietDatXeRepo;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Service
public class ChiTietDatXeService implements IChiTietDatXeService {
	@Autowired
	private ChiTietDatXeRepo cTDXeRepo;

	@Override
	public ChiTietDatXe findById(Integer id) {

		return cTDXeRepo.findBychiTietDatXeId(id);
	}

	@Override
	public ChiTietDatXe create(ChiTietDatXe cTDX) {
		return cTDXeRepo.save(cTDX);
	}

}
