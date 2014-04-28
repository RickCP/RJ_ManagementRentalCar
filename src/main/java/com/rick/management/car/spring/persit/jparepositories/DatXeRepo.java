package com.rick.management.car.spring.persit.jparepositories;

import com.rick.management.car.spring.persit.JpaBaseRepo;
import com.rick.management.car.spring.persit.domain.DatXe;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public interface DatXeRepo extends JpaBaseRepo<DatXe,Integer> {
public DatXe findBydatXeId(Integer id);
}
