package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.NhapXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface INhapXeService {
	public NhapXe create(NhapXe xe);
	public List<NhapXe> findAll();
	
	

}
