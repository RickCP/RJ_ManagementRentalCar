package com.rick.management.car.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;
import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.service.IUserService;
import com.rick.management.car.spring.web.bean.UserUI;
import com.rick.management.car.spring.web.mapper.UserMapper;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping(value = "/user/thanhvien",method = RequestMethod.GET)
	public String listUser(Model model)
	{	List<User> users = userService.findAll();
		List<UserUI> userUIs = UserMapper.convertToListUI(users);
		model.addAttribute("userUIs",userUIs);
		return WebConstants.Views.DM_THANH_VIEN;
	}
	@RequestMapping(value = "/user/view",method = RequestMethod.GET)
	public String getViewPage(Integer id)
	{
		return WebConstants.Views.VIEW_USER;
	}

}
