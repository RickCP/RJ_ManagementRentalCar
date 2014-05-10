package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.NhapXe;
import com.rick.management.car.spring.persit.jparepositories.NhapXeRepo;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Service
public class NhapXeService implements INhapXeService {
	@Autowired
	private NhapXeRepo nhapXeRepo;
	@Override
	public NhapXe create(NhapXe xe) {
		
		return nhapXeRepo.save(xe);
	}

	@Override
	public List<NhapXe> findAll() {
		
		return nhapXeRepo.findAll();
	}

}
