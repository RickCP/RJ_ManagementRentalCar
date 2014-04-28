package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.jparepositories.DMXeRepo;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Service
public class DMXeService implements IDMXeService {
	@Autowired
	private DMXeRepo dMXeRepo;

	@Override
	public List<DmXe> findAll() {
		return dMXeRepo.findAll();
	}

	@Override
	public DmXe findBydmXeId(Integer id) {
		return dMXeRepo.findBydmXeId(id);
	}

	@Override
	public List<DmXe> findByHangXe(String tenHangXe) {

		return dMXeRepo.FindByHangXe(tenHangXe);
	}

	@Override
	public DmXe saveOrUpdate(DmXe xe) {

		return dMXeRepo.save(xe);
	}

}
