package com.rick.management.car.spring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rick.management.car.spring.persit.domain.User;
import com.rick.management.car.spring.persit.repositories.UserRepo;
import com.rick.management.car.spring.security.bean.JvUserDetails;

/**
 * 
 * @author lvhuy08t2@gmail.com
 * 
 */
@Service
public class JvUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		User user = userRepo.findByUsername(userName);
		UserDetails userDetails = null;
		if (user == null) {
			throw new UsernameNotFoundException(String.format(
					"Cannot find user by userNam [%s]", userName));
		}
		String password = user.getPassword();
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("USER"));
		userDetails = new JvUserDetails(userName, password, enabled,
				accountNonExpired, credentialsNonExpired, accountNonLocked,
				authorities, user);
		return userDetails;
	}

}
