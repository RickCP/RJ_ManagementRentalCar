package com.rick.management.car.spring.web.mapper;

import java.text.ParseException;

import org.apache.commons.lang.time.DateUtils;

import com.rick.management.car.spring.persit.domain.ChiTietDatXe;
import com.rick.management.car.spring.persit.domain.DatXe;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.web.bean.DatXeUI;
import com.rick.management.car.spring.web.common.StringUtil;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class DatXeMapper {
	public static final String[] PATTERN_DATE = { "dd/mm/yy" };

	public static DatXe convertToEntity(DatXeUI ui, User user,DmXe dmXe) {

		DatXe datXe = new DatXe();
		ChiTietDatXe cTDatXe =new ChiTietDatXe();
		if (ui != null && dmXe != null) {
			datXe.setUser(user);
			datXe.setLienHe(ui.getLienHe());
			try {
				datXe.setNgayDatThue(DateUtils.parseDate(ui.getNgayThue(),
						PATTERN_DATE));
				cTDatXe.setNgayThue(DateUtils.parseDate(ui.getNgayThue(),
						PATTERN_DATE));
				cTDatXe.setNgayTra(DateUtils.parseDate(ui.getNgayTra(),PATTERN_DATE));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cTDatXe.setDatXe(datXe);
			cTDatXe.setDmXe(dmXe);
			cTDatXe.setSoLuong(StringUtil.getIntValue(ui.getSoLuong()));
			
			
		}
		return datXe;
	}

}
