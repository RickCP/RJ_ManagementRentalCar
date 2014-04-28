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
import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IDMXeService;
import com.rick.management.car.spring.service.IHangXeService;
import com.rick.management.car.spring.web.bean.DMXeUI;
import com.rick.management.car.spring.web.bean.HangXeUI;
import com.rick.management.car.spring.web.common.SecurityUtil;
import com.rick.management.car.spring.web.mapper.DMXeMapper;
import com.rick.management.car.spring.web.mapper.HangXeMapper;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Controller
public class HomeController {
	@Autowired
	private IDMXeService dMXeService;
	@Autowired
	private IHangXeService hangXeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage(Model model, Principal principal) {
		if (principal != null)
			model.addAttribute("menu", "menu-loged");
		else
			model.addAttribute("menu", "menu");
		List<HangXe> hangXes = hangXeService.findAll();
		List<HangXeUI> hangXeUIs = HangXeMapper.convertToListUI(hangXes);
		model.addAttribute("hangXeUIs", hangXeUIs);
		List<DmXe> xes = dMXeService.findAll();
		model.addAttribute("xes", xes);
		return WebConstants.Views.INDEX_PAGE;

	}

	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public String redirectPage(Model model) {
		User currentUser = SecurityUtil.getCurrentUser();
		if (currentUser.getQuyen().getQuyenName()
				.equals(WebConstants.ROLE_ADMIN)) {
			return WebConstants.Views.ADMINPAGE;
		} else {
			List<DmXe> xes = dMXeService.findAll();
			model.addAttribute("xes", xes);
			List<HangXe> hangXes = hangXeService.findAll();
			List<HangXeUI> hangXeUIs = HangXeMapper.convertToListUI(hangXes);
			model.addAttribute("hangXeUIS", hangXeUIs);
			return WebConstants.Views.INDEX_PAGE;
		}
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detailXePage(Integer id, Model model, Principal principal) {
		DmXe existingDmXe = dMXeService.findBydmXeId(id);
		DMXeUI xe = new DMXeUI();
		if (existingDmXe != null) {
			xe = DMXeMapper.convertToUI(existingDmXe);

		}
		model.addAttribute("xe", xe);
		if (principal != null)
			model.addAttribute("menu", "menu-loged");
		else
			model.addAttribute("menu", "menu");
		return WebConstants.Views.DETAIL_XE_PAGE;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchByHangXe(Model model, Principal principal,Integer hangXeId) {
		if (principal != null)
			model.addAttribute("menu", "menu-loged");
		else
			model.addAttribute("menu", "menu");
		HangXe hangXe = hangXeService.findByhangXeId(hangXeId);
		List<DmXe> xes = dMXeService.findByHangXe(hangXe.getTenHangXe());
		model.addAttribute("xes", xes);
		List<HangXe> hangXes = hangXeService.findAll();
		List<HangXeUI> hangXeUIs = HangXeMapper.convertToListUI(hangXes);
		model.addAttribute("hangXeUIs", hangXeUIs);
		return WebConstants.Views.INDEX_PAGE;
	}

}
