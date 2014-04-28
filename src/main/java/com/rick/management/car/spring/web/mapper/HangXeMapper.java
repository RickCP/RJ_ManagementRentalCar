package com.rick.management.car.spring.web.mapper;

import java.util.ArrayList;
import java.util.List;

import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.web.bean.HangXeUI;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class HangXeMapper {
	public static HangXeUI convertToUI(HangXe hangXe) {
		HangXeUI ui = new HangXeUI();
		if (hangXe != null) {
			ui.setHangXeId(hangXe.getHangXeId());
			ui.setTenHangXe(hangXe.getTenHangXe());
		}
		return ui;
	}

	public static HangXe convertToEntity(HangXeUI ui) {
		HangXe hangXe = new HangXe();
		if (ui != null) {
			hangXe.setHangXeId(ui.getHangXeId());
			hangXe.setTenHangXe(ui.getTenHangXe());
		}
		return hangXe;
	}

	public static List<HangXeUI> convertToListUI(List<HangXe> hangXes) {
		List<HangXeUI> uis = new ArrayList<HangXeUI>();
		for (HangXe hangXe : hangXes) {
			uis.add(convertToUI(hangXe));
		}
		return uis;
	}

	public static List<HangXe> convertToEntity(List<HangXeUI> uis) {
		List<HangXe> hangXes = new ArrayList<HangXe>();
		for (HangXeUI ui : uis) {
			hangXes.add(convertToEntity(ui));
		}
		return hangXes;
	}

}
