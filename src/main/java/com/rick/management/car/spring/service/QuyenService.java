package com.rick.management.car.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.Quyen;
import com.rick.management.car.spring.persit.jparepositories.QuyenRepo;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Service
public class QuyenService implements IQuyenService {
	@Autowired
	private QuyenRepo quyenRepo;
	@Override
	public Quyen findByQuyenName(String quyenName) {
		return quyenRepo.findByQuyenName(quyenName);
	}

}
