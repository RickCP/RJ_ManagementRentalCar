package com.rick.management.car.spring.web.mapper;

import java.util.ArrayList;
import java.util.List;

import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.LoaiXe;
import com.rick.management.car.spring.web.bean.DMXeUI;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class DMXeMapper {
	public DMXeUI convertToUI(DmXe xe) {
		DMXeUI ui = new DMXeUI();
		if (xe != null) {
			ui.setDmXeId(xe.getDmXeId());
			ui.setGiaThueXe(xe.getGiaThueXe());
			ui.setHinhAnh(xe.getHinhAnh());
			ui.setHinhAnhSlider(xe.getHinhAnhSlider());
			ui.setLoaiXe(xe.getLoaiXe().getTenLoaiXe());
			ui.setSoLuongThue(xe.getSoLuongThue());
			ui.setTenXe(xe.getTenXe());
			ui.setThongTin(xe.getThongTin());
			ui.setTongSoLuong(xe.getTongSoLuong());
		}
		return ui;
	}

	public DmXe convertToEntity(DMXeUI ui, LoaiXe loaiXe) {
		DmXe xe = new DmXe();
		if (ui != null) {
			xe.setDmXeId(ui.getDmXeId());
			xe.setGiaThueXe(ui.getGiaThueXe());
			xe.setHinhAnh(ui.getHinhAnh());
			xe.setLoaiXe(loaiXe);
			xe.setSoLuongThue(ui.getSoLuongThue());
			xe.setTenXe(ui.getTenXe());
			xe.setThongTin(ui.getThongTin());
			xe.setTongSoLuong(ui.getTongSoLuong());
			xe.setHinhAnhSlider(ui.getHinhAnhSlider());

		}
		return xe;
	}

	public List<DMXeUI> convertToListUI(List<DmXe> xes) {
		List<DMXeUI> uis = new ArrayList<DMXeUI>();
		for (DmXe xe : xes) {
			uis.add(convertToUI(xe));
		}
		return uis;
	}

	public List<DmXe> convertToListEntity(List<DMXeUI> uis, LoaiXe loaiXe) {
		List<DmXe> xes = new ArrayList<DmXe>();
		for (DMXeUI ui : uis) {
			xes.add(convertToEntity(ui, loaiXe));
		}
		return xes;
	}
}
