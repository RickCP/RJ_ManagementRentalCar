package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.DmXe;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public interface IDMXeService {

	public List<DmXe> findAll();
	
	public DmXe findBydmXeId(Integer id);
	
	public List<DmXe> findByHangXe(String tenHangXe);
	
	public DmXe saveOrUpdate(DmXe xe);
	
	

}
