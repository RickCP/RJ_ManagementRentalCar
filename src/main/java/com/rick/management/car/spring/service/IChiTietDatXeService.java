package com.rick.management.car.spring.service;

import com.rick.management.car.spring.persit.domain.ChiTietDatXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface IChiTietDatXeService {
	public ChiTietDatXe findById(Integer id);
	public ChiTietDatXe create(ChiTietDatXe cTDX);

}
