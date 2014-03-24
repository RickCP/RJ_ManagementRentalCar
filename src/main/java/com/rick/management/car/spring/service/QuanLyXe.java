package com.rick.management.car.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rick.management.car.spring.dao.DMXeDao;
import com.rick.management.car.spring.persit.domain.DmQuyen;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.HangXe;

@Service
public class QuanLyXe implements IQuanLyXe {
    @Autowired
    private DMXeDao dmxeDao;
	@Override
	@Transactional(readOnly=true)
	public List<DmXe> getAllDmxes() {
		
		return dmxeDao.getAllDmXes();
	}
	@Override
	@Transactional(readOnly=true)
	public HangXe getHangXeById(int id) {
		return dmxeDao.getHangXeById(id);
	}

	@Override
	public List<DmQuyen> getAllDmQuyens() {
		
		return dmxeDao.getAllDmQuyens();
	}

}
