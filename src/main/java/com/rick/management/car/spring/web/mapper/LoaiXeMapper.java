package com.rick.management.car.spring.web.mapper;

import java.util.ArrayList;
import java.util.List;

import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.persit.domain.LoaiXe;
import com.rick.management.car.spring.web.bean.LoaiXeUI;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class LoaiXeMapper {
	public static LoaiXe convertToEntity(LoaiXeUI ui, HangXe hangXe) {
		LoaiXe loaiXe = new LoaiXe();
		if (ui != null) {

			loaiXe.setHangXe(hangXe);
			loaiXe.setSoCho(ui.getSoCho());
			loaiXe.setTenLoaiXe(ui.getTenLoaiXe());
		}
		return loaiXe;
	}
	public static LoaiXeUI convertToUI(LoaiXe loaiXe)
	{	LoaiXeUI ui =new LoaiXeUI();
		if(loaiXe != null)
		{
			ui.setLoaiXeId(loaiXe.getLoaiXeId());
			ui.setSoCho(loaiXe.getSoCho());
			ui.setTenhangXe(loaiXe.getHangXe().getTenHangXe());
			ui.setTenLoaiXe(loaiXe.getTenLoaiXe());
		}
		return ui;
	}
	public static List<LoaiXe> convertToListEntity(List<LoaiXeUI> uis,HangXe hangXe)
	{
		List<LoaiXe> loaiXes =new ArrayList<LoaiXe>();
		for(LoaiXeUI ui : uis)
		{
			loaiXes.add(convertToEntity(ui, hangXe));
		}
		return loaiXes;
	}
	public static List<LoaiXeUI> convertToListUI(List<LoaiXe> loaiXes)
	{
		List<LoaiXeUI> uis =new ArrayList<LoaiXeUI>();
		for(LoaiXe loaiXe : loaiXes)
		{
			uis.add(convertToUI(loaiXe));
		}
		return uis;
	}

}
