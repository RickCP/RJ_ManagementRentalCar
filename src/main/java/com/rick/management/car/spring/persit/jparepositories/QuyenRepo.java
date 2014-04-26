package com.rick.management.car.spring.persit.jparepositories;

import com.rick.management.car.spring.persit.JpaBaseRepo;
import com.rick.management.car.spring.persit.domain.Quyen;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface QuyenRepo extends JpaBaseRepo<Quyen,Integer>{
	public Quyen findByQuyenName(String quyenName);

}
