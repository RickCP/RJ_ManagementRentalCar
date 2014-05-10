package com.rick.management.car.spring.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.persit.domain.LoaiXe;
import com.rick.management.car.spring.service.IHangXeService;
import com.rick.management.car.spring.service.ILoaiXeService;
import com.rick.management.car.spring.web.bean.HangXeUI;
import com.rick.management.car.spring.web.bean.LoaiXeUI;
import com.rick.management.car.spring.web.mapper.HangXeMapper;
import com.rick.management.car.spring.web.mapper.LoaiXeMapper;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Controller
public class LoaiXeController {
	@Autowired
	private IHangXeService hangXeService;
	@Autowired
	private ILoaiXeService loaiXeService;
	@RequestMapping(value = "/user/themloai", method = RequestMethod.GET)
	public String create(Model model)
	{
		LoaiXeUI ui = new LoaiXeUI();
		model.addAttribute("ui",ui);
		List<HangXe> hangXes = hangXeService.findAll();
		List<HangXeUI> hangXeUIs = HangXeMapper.convertToListUI(hangXes);
		model.addAttribute("hangXeUIs",hangXeUIs);
		return WebConstants.Views.VIEW_LOAI_XE;
		
	}
	@RequestMapping(value = "/user/themloai", method = RequestMethod.POST)
	public String doCreate(Model model, @Valid LoaiXeUI ui)
	{
		HangXe hangXe  = hangXeService.findBytenHangXe(ui.getTenhangXe());
		if(hangXe != null)
		{
			LoaiXe loaiXe = LoaiXeMapper.convertToEntity(ui, hangXe);
			loaiXeService.create(loaiXe);
			model.addAttribute("msg","Thêm loại xe thành công !");
		}
		LoaiXeUI uix = new LoaiXeUI();
		model.addAttribute("ui",uix);
		List<HangXe> hangXes = hangXeService.findAll();
		List<HangXeUI> hangXeUIs = HangXeMapper.convertToListUI(hangXes);
		model.addAttribute("hangXeUIs",hangXeUIs);
		return WebConstants.Views.VIEW_LOAI_XE;
		
	}

}
