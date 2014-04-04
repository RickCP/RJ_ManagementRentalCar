package com.rick.management.car.spring.security.bean;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */

public class JvUserDetails extends User {
	public JvUserDetails(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities,com.rick.management.car.spring.persit.domain.User jvUser) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);
		this.jvUser = jvUser;
	}

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private com.rick.management.car.spring.persit.domain.User jvUser;

	public com.rick.management.car.spring.persit.domain.User getJvUser() {
		return jvUser;
	}

	public void setJvUser(
			com.rick.management.car.spring.persit.domain.User jvUser) {
		this.jvUser = jvUser;
	}

	

}
