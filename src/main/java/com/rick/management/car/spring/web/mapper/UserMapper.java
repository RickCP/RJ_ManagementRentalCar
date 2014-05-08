package com.rick.management.car.spring.web.mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.web.bean.UserUI;
import com.rick.management.car.spring.web.common.StringUtil;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
public class UserMapper {
	public static final String[] PATTERN_DATE = { "dd/mm/yy" };

	public static UserUI convertToUI(User user) {
		UserUI ui = new UserUI();
		if (user != null) {
			ui.setCmnd(String.valueOf(user.getCmnd()));
			ui.setDiaChi(user.getDiachi());
			ui.setDienThoai(user.getDienThoai());
			ui.setEmail(user.getEmail());
			if(user.getGioiTinh() == 1)
			ui.setGioiTinh("Nam");
			else
			ui.setGioiTinh("Nữ");
			ui.setHoTen(user.getHoTen());
			ui.setId(user.getId());
			ui.setNgaySinh(StringUtil.convertDateTimeToString(user.getNgaySinh()));
			ui.setPassword(user.getPassword());
			ui.setUsername(user.getUserName());

		}
		return ui;
	}

	public static User convertToEntity(UserUI ui) {
		User user = new User();
		if (ui != null) {
			user.setCmnd(StringUtil.getLongValue(ui.getCmnd()));
			user.setDiachi(ui.getDiaChi());
			user.setDienThoai(ui.getDienThoai());
			user.setEmail(ui.getEmail());
			if(ui.getGioiTinh().equals("Nam"))
			user.setGioiTinh((short)1);
			else
			user.setGioiTinh((short)0);
			user.setHoTen(ui.getHoTen());
			user.setId(ui.getId());
			try {
				user.setNgaySinh(DateUtils.parseDate(ui.getNgaySinh(),
						PATTERN_DATE));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			user.setPassword(ui.getPassword());
			user.setUserName(ui.getUsername());
		}
		return user;
	}
	
	public static List<UserUI> convertToListUI(List<User> users)
	{
		List<UserUI> uis =new ArrayList<UserUI>();
		for (User user : users) {
			uis.add(convertToUI(user));
		}
		return uis;
	}
	public static List<User> convertToListEntity(List<UserUI> uis)
	{
		List<User> users =new ArrayList<User>();
		for(UserUI ui : uis)
		{
			users.add(convertToEntity(ui));
		}
		return users;
	}

}
