package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.ChiTietNhapXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface IChiTietNhapXe {
	public List<ChiTietNhapXe> findAll();
	public ChiTietNhapXe create(ChiTietNhapXe cTNXe);

}
