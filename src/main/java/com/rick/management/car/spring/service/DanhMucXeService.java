package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.repositories.DanhMucXeRepo;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Service("danhMucXeService")
public class DanhMucXeService implements IDanhMucXeService {
    @Autowired
    private DanhMucXeRepo danhMucXeRepo;
	@Override
	public List<DmXe> findAllDmxes() {
		return danhMucXeRepo.findAll();
	}
	@Override
	public DmXe findDmxeId(int dmXeId) {
		
		return danhMucXeRepo.findOne(dmXeId);
	}

}
