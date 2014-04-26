package com.rick.management.car.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rick.management.car.spring.constant.WebConstants;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Controller
public class LinkController {
	@RequestMapping(value = "/contact",method =RequestMethod.GET)
	public String getContactPage()
	{
		return WebConstants.Views.CONTACT_PAGE;
	}
}
