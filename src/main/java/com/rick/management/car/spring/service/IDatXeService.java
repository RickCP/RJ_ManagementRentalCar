package com.rick.management.car.spring.service;

import com.rick.management.car.spring.persit.domain.DatXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface IDatXeService {
	public DatXe create(DatXe xe);
	public DatXe findById(Integer id);

}
