package com.rick.management.car.spring.web.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IDMXeService;
import com.rick.management.car.spring.web.common.SecurityUtil;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Controller
public class HomeController {
	@Autowired
	private IDMXeService dMXeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage(Model model, Principal principal) {
		if (principal != null)
			model.addAttribute("menu", "menu-loged");
		else
			model.addAttribute("menu", "menu");
		List<DmXe> xes = dMXeService.findAll();
		model.addAttribute("xes", xes);
		return WebConstants.Views.INDEX_PAGE;

	}

	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public String redirectPage() {
		User currentUser = SecurityUtil.getCurrentUser();
		if (currentUser.getQuyen().getQuyenName()
				.equals(WebConstants.ROLE_ADMIN)) {
			return WebConstants.Views.ADMINPAGE;
		} else {
			return WebConstants.Views.INDEX_PAGE;
		}
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detailXePage(Integer id, Model model, Principal principal) {
		if (principal != null)
			model.addAttribute("menu", "menu-loged");
		else
			model.addAttribute("menu", "menu");
		return WebConstants.Views.DETAIL_XE_PAGE;
	}
}
