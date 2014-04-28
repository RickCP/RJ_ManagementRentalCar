package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.HangXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */

public interface IHangXeService {
	public List<HangXe> findAll();
	public HangXe findByhangXeId(Integer hangXeId);

}
