package com.rick.management.car.spring.web.common;

import org.springframework.security.core.context.SecurityContextHolder;

import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.security.bean.JvUserDetails;


/**
 * Contains utility methods for security
 * @author hunglevn@outlook.com
 *
 */
public class SecurityUtil {
	public static JvUserDetails getUserDetail() {
		return (JvUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();	
	}
	
	public static User getCurrentUser() {
		JvUserDetails userDetail = (JvUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User jvUser = userDetail.getJvUser();
		return jvUser;
	}
	
}
