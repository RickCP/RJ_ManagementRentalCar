package com.rick.management.car.spring.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.service.IDanhMucXeService;

@Controller
public class QuanLyXeController {
	@Autowired
	private IDanhMucXeService danhMucXeService;
	@RequestMapping(value="/admin/list",method = RequestMethod.GET)
	public ModelAndView getAllDmXes()
	{
		ModelAndView modelAndView =new ModelAndView(WebConstants.Views.LIST_DMXE);
		List<DmXe> dmxes=new ArrayList<DmXe>();
		dmxes =danhMucXeService.findAllDmxes();
		System.out.println(dmxes.get(0).getTenXe());
		modelAndView.addObject("dmxes",dmxes);
		return modelAndView;
	}
	@RequestMapping(value="/admin/manager_memeber",method = RequestMethod.GET)
	public ModelAndView getAllDmxes() {
		
		return new ModelAndView(WebConstants.Views.MANAGER_MEMBER);
	}
	
	
	

}
