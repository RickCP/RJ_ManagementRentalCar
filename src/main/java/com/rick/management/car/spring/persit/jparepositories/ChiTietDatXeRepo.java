package com.rick.management.car.spring.persit.jparepositories;

import com.rick.management.car.spring.persit.JpaBaseRepo;
import com.rick.management.car.spring.persit.domain.ChiTietDatXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface ChiTietDatXeRepo extends JpaBaseRepo<ChiTietDatXe,Integer> {
	public ChiTietDatXe findBychiTietDatXeId(Integer id);

}
