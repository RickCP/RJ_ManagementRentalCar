package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.LoaiXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface ILoaiXeService {
	public List<LoaiXe> findAll();
	public LoaiXe create(LoaiXe loaiXe);

}
