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
public class HomeController {
	@Autowired
	private IDanhMucXeService danhMucXeService;
	
	
	@RequestMapping(value = "/welcome/**", method = RequestMethod.GET)
	public ModelAndView findAllDmxes()
	{
		ModelAndView modelAndView =new ModelAndView(WebConstants.Views.CLIENT_INDEX);
		List<DmXe> dmxes=new ArrayList<DmXe>();
		dmxes =danhMucXeService.findAllDmxes();
		modelAndView.addObject("dmxes",dmxes);
		return modelAndView;
	}
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		ModelAndView modelAndView =new ModelAndView(WebConstants.Views.CLIENT_INDEX);
		List<DmXe> dmxes=new ArrayList<DmXe>();
		dmxes =danhMucXeService.findAllDmxes();
		modelAndView.addObject("dmxes",dmxes);
		return modelAndView;
	}
	
	}
