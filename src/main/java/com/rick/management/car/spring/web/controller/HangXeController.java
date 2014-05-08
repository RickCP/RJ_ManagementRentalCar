package com.rick.management.car.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.service.IHangXeService;
import com.rick.management.car.spring.web.bean.HangXeUI;
import com.rick.management.car.spring.web.mapper.HangXeMapper;


/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Controller
public class HangXeController {
	@Autowired
	private IHangXeService hangXeService;
	@RequestMapping(value = "/user/themhang",method = RequestMethod.GET)
	public String create(Model model)
	{
		HangXeUI ui =new HangXeUI();
		model.addAttribute("ui", ui);
		return WebConstants.Views.VIEW_HANG_XE;
		
	}
	@RequestMapping(value = "/user/themhang",method = RequestMethod.POST)
	public String doCreate(Model model,@Valid  HangXeUI ui)
	{
		if(!ui.getTenHangXe().equals("") || ui.getTenHangXe() != null)
		{
			HangXe hangXe = HangXeMapper.convertToEntity(ui);
			hangXeService.create(hangXe);
			model.addAttribute("msg","Thêm hãng xe thành công !");
		}
		else
		{
			model.addAttribute("msg","Vui lòng nhập tên hãng xe !");
		}
		HangXeUI uix =new HangXeUI();
		model.addAttribute("ui", uix);
		return WebConstants.Views.VIEW_HANG_XE;
	}

}
