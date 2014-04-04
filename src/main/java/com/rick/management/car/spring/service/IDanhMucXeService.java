package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.DmXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface IDanhMucXeService {
	public List<DmXe> findAllDmxes();
	public DmXe findDmxeId(int dmXeId);

}
