package com.rick.management.car.spring.web.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.ChiTietNhapXe;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.LoaiXe;
import com.rick.management.car.spring.persit.domain.NhapXe;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IChiTietNhapXe;
import com.rick.management.car.spring.service.IDMXeService;
import com.rick.management.car.spring.service.ILoaiXeService;
import com.rick.management.car.spring.service.INhapXeService;
import com.rick.management.car.spring.service.IUserService;
import com.rick.management.car.spring.web.bean.DMXeUI;
import com.rick.management.car.spring.web.bean.LoaiXeUI;
import com.rick.management.car.spring.web.bean.NhapXeUI;
import com.rick.management.car.spring.web.common.SecurityUtil;
import com.rick.management.car.spring.web.mapper.DMXeMapper;
import com.rick.management.car.spring.web.mapper.LoaiXeMapper;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Controller
public class NhapXeController {
	@Autowired
	private ILoaiXeService loaiXeService;
	@Autowired
	private IDMXeService dmXeService;
	@Autowired
	IUserService userService;
	@Autowired
	private IChiTietNhapXe chiTietNhapXeService;
	@Autowired
	private INhapXeService nhapXeService;

	@RequestMapping(value = "/user/xe", method = RequestMethod.GET)
	public String Create(Model model) {
		NhapXeUI ui = new NhapXeUI();
		User user = SecurityUtil.getCurrentUser();
		if (user != null) {
			ui.setUser(user.getUserName());
			ui.setNhapXeId(UUID.randomUUID().toString());
			
			Date today = new Date();
			ui.setNgayNhap(today.toString());
			List<LoaiXe> loaiXes = loaiXeService.findAll();
			List<LoaiXeUI> uis = LoaiXeMapper.convertToListUI(loaiXes);
			List<DmXe> xes = dmXeService.findAll();
			List<DMXeUI> dmXeUIs = DMXeMapper.convertToListUI(xes);
			model.addAttribute("dmXeUIs", dmXeUIs);
			model.addAttribute("loaiXeUIs", uis);
			model.addAttribute("ui", ui);
		}
		return WebConstants.Views.VIEW_XE;
	}

	@RequestMapping(value = "/user/xe", method = RequestMethod.POST)
	public String doCreate(@Valid NhapXeUI ui) {
		String tenloaiXe = ui.getTenLoaiXe();
		String tenXe = ui.getTenXe();
		User user = userService.findByUserName(ui.getUser());
		DmXe xeSelected = dmXeService.findBytenXe(tenXe);
		if (xeSelected != null && user != null) {
			ChiTietNhapXe chiTietNhapXe = new ChiTietNhapXe();
			chiTietNhapXe.setDmXe(xeSelected);
			chiTietNhapXe.setDonGia(Float.valueOf(ui.getTongSoTien()));
			chiTietNhapXe.setSoLuong(Integer.valueOf(ui.getSoLuong()));
			
			NhapXe nhapXe = new NhapXe();
			nhapXe.setNgayNhap(new Date());
			nhapXe.setUser(user);
			nhapXe.setTongSoTien(Double.valueOf(ui.getTongSoTien()));
			chiTietNhapXe.setNhapXe(nhapXe);
			nhapXeService.create(nhapXe);
			chiTietNhapXeService.create(chiTietNhapXe);
		}
		return "redirect:/user/xe";

	}

}
