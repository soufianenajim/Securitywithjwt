package com.api.config;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.api.model.user.User;
import com.api.repo.UserRepo;


@Order(value = Ordered.HIGHEST_PRECEDENCE)
@Configuration
public class OAuth2RefreshConfig {

	@Bean
	public CustomUserDetailsService userDetailsService() {
		return new CustomUserDetailsService();
	}

	public static class CustomUserDetailsService implements UserDetailsService {

		@Autowired
		private UserRepo userRepo;


		@Override
		public UserDetails loadUserByUsername(String username) {

	    	User user = userRepo.findByUsername(username);
	    System.out.println(user);
	        if (user != null) {
	            return  user;
	        }
	        throw new UsernameNotFoundException(username);
	    
		}

	}

}
