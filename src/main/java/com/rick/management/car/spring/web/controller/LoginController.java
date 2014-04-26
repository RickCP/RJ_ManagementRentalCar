package com.rick.management.car.spring.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.Quyen;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IQuyenService;
import com.rick.management.car.spring.service.UserService;
import com.rick.management.car.spring.web.bean.UserUI;
import com.rick.management.car.spring.web.mapper.UserMapper;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private IQuyenService quyenService;

	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String getLoginPage() {

		return WebConstants.Views.LOGIN_PAGE;

	}

	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String postLoginPage(Model model) {
		String error = "error";
		model.addAttribute("error", error);
		return WebConstants.Views.LOGIN_PAGE;
	}

	@RequestMapping(value = "/user/index", method = RequestMethod.GET)
	public String getAdminPage() {
		return WebConstants.Views.ADMINPAGE;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegisterPage(Model model) {
		UserUI userUI = new UserUI();
		model.addAttribute("userUI", userUI);
		return WebConstants.Views.REGISTER_PAGE;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegisterPage(@Valid UserUI userUI, Model model) {
		
		User userExisting = userService.findUserByUsernameAndPassword(
				userUI.getUsername(), userUI.getPassword());
		if (userExisting != null) {
			model.addAttribute("errors", "Tên tài khoản đã tồn tại.");
			return WebConstants.Views.REGISTER_PAGE;
		} else {
			if (!userUI.getPassword().equals(userUI.getRePassword())) {
				model.addAttribute("errors", "Mật khẩu không khớp.");
				return WebConstants.Views.REGISTER_PAGE;
			} else {
				Quyen quyen = quyenService.findByQuyenName("User");
				if(quyen != null)
				{
				User userSaved = UserMapper.convertToEntity(userUI);
				userSaved.setQuyen(quyen);
				userService.create(userSaved);
				}
			}
		}

		return "redirect:/user/login";
	}

}
