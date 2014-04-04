package com.rick.management.car.spring.web.config.security;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
public class JvAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
	private static final String FAILURE_URL = "/login/sign_in.jv?error=1";
	public JvAuthenticationFailureHandler() {
		/**
		 * for keeping ModelAttribute in target model;
		 */
		this.setUseForward(true);
		this.setDefaultFailureUrl(FAILURE_URL);
	}
}
