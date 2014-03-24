package com.rick.management.car.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping(value = "/manager/listUser", method = RequestMethod.GET)
	public ModelAndView showListUsers(Model model)
	{   ModelAndView modelAndView = new ModelAndView("manager/listUserPage");
		List<User> users = userService.findAll();
		if(users != null)
		{
			model.addAttribute("users",users);
		}
		return modelAndView;
	}

}
