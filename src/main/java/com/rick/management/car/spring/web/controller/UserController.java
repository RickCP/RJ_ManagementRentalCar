package com.rick.management.car.spring.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IUserService;
import com.rick.management.car.spring.web.form.UserForm;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/admin/listUser", method = RequestMethod.GET)
	public ModelAndView showListUsers(Model model) {
		ModelAndView modelAndView = new ModelAndView("manager/listUserPage");
		List<User> users = userService.findByQuyenId(1);
		if (users != null) {
			model.addAttribute("users", users);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/admin/manager_member", method = RequestMethod.GET)
	public ModelAndView showPageAddAccount(Model model) {
		List<User> users = userService.findAll();
		List<UserForm> userForms = new ArrayList<UserForm>();
		for (User user : users) {
			UserForm userForm = new UserForm();
			if (user.getGioiTinh() == 0) {
				userForm.setGioiTinh("Nu");
			} else {
				userForm.setGioiTinh("Nam");
			}
			userForm.setCmnd(user.getCmnd());
			userForm.setDiachi(user.getDiachi());
			userForm.setHoTen(user.getHoTen());
			userForm.setUserName(user.getUserName());
			userForm.setPassword(user.getPassword());
			userForm.setDienThoai(user.getDienThoai());
			userForm.setEmail(user.getEmail());
			userForm.setNgaySinh(user.getNgaySinh());
			userForm.setQuanliId(user.getQuanliId());
			userForms.add(userForm);

		}
		model.addAttribute("userForms", userForms);
		return new ModelAndView(WebConstants.Views.MANAGER_MEMBER);
	}

}
