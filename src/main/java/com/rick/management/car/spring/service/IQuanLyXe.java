package com.rick.management.car.spring.service;

import java.util.List;

import com.rick.management.car.spring.persit.domain.DmQuyen;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.HangXe;

public interface IQuanLyXe {
public List<DmXe> getAllDmxes();
public HangXe getHangXeById(int id);

public List<DmQuyen> getAllDmQuyens();

}
