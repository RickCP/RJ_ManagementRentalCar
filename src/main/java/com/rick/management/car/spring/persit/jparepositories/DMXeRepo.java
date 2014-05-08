package com.rick.management.car.spring.persit.jparepositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rick.management.car.spring.persit.JpaBaseRepo;
import com.rick.management.car.spring.persit.domain.DmXe;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public interface DMXeRepo extends JpaBaseRepo<DmXe, Integer> {
	public DmXe findBydmXeId(Integer id);

	public String FIND_BY_HANG_XE = "SELECT dmXe FROM DmXe dmXe JOIN dmXe.loaiXe loaixe JOIN loaixe.hangXe hangxe WHERE hangxe.tenHangXe = :tenHangXe ";

	@Query(FIND_BY_HANG_XE)
	public List<DmXe> FindByHangXe(@Param("tenHangXe") String tenHangXe);
	
	public DmXe  findBytenXe(String tenXe);

}
