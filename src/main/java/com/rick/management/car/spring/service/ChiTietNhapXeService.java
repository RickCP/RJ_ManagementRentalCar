package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.ChiTietNhapXe;
import com.rick.management.car.spring.persit.jparepositories.ChiTietNhapXeRepo;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Service
public class ChiTietNhapXeService implements IChiTietNhapXe {
	@Autowired 
	private ChiTietNhapXeRepo chiTietNhapXeRepo;

	@Override
	public List<ChiTietNhapXe> findAll() {
		
		return chiTietNhapXeRepo.findAll();
	}

	@Override
	public ChiTietNhapXe create(ChiTietNhapXe cTNXe) {
		
		return chiTietNhapXeRepo.save(cTNXe);
	}

	

}
