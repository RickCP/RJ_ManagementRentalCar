package com.rick.management.car.spring.persit.jparepositories;

import com.rick.management.car.spring.persit.JpaBaseRepo;
import com.rick.management.car.spring.persit.domain.HangXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface HangXeRepo  extends JpaBaseRepo<HangXe,Integer>{
	public HangXe findByhangXeId(Integer hangXeId);

}
