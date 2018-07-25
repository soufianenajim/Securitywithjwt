package com.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	


	

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	

	
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		// @formatter:off

		http.authorizeRequests().antMatchers("/login").permitAll()
				.antMatchers("/oauth/token/").permitAll()
				.anyRequest().authenticated().and().formLogin().permitAll()
				.and().csrf().disable()
				.headers().frameOptions().disable();
		// @formatter:on

		http.csrf().disable();
		http.headers().frameOptions().disable();

	}

}
