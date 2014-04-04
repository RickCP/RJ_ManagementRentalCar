package com.rick.management.car.spring.web.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private AuthenticationSuccessHandler jvAuthenticationSuccessHandler;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
    }
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		 web
	      .ignoring()
	         .antMatchers("/assets/**"); // #3
	}
	@Bean 
	public AuthenticationManager jvAuthenticationManager() throws Exception {
		return authenticationManager();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
        	.antMatchers("/assets/**", "/login/sign_up.jv", "/login/sign_in.jv").permitAll()  
            .antMatchers("/**").hasAuthority("USER")
            .and()
        .formLogin()
            .loginPage("/login/sign_in.jv")
            .usernameParameter("username")
            .passwordParameter("password")
            .loginProcessingUrl("/login/sign_in.jv")
            .failureHandler(new JvAuthenticationFailureHandler())
            .successHandler(jvAuthenticationSuccessHandler)
            .defaultSuccessUrl("/index/client.jv")
            .permitAll();
		http.logout().logoutUrl("/login/sign_out.jv").logoutSuccessUrl("/login/sign_in.jv");
	}

}
