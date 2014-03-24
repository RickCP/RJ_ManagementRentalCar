package com.rick.management.car.spring.dao;

import java.util.List;

import com.rick.management.car.spring.persit.domain.DmQuyen;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.HangXe;

public interface DMXeDao {
	public List<DmXe> getAllDmXes();
	
	public HangXe getHangXeById(int id);
	
	public List<DmQuyen> getAllDmQuyens();

}
