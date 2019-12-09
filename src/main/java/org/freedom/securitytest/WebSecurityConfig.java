package org.freedom.securitytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	 @Bean
	    PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	 
	 @Autowired
		public void config(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication()
					.withUser("li")
					.password("$2a$10$0taMD3JJvlxnp6J8y5OWfO6ANMzyvmnl1JPjJRDK/xJiYbfIWWSSC")
					.roles("USER")
					.and()
					.withUser("admin")
					.password("$2a$10$juelhnkt08Pa7BKJwxZCau4Luzq2z9ZP5vAFVc39jtdRQGMnRC3Nq")
					.roles("ADMIN","USER");
					
			
		}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/","/error").permitAll()
				.antMatchers("/hello").hasRole("USER")
				.antMatchers("/admin").hasRole("ADMIN")
				.anyRequest().authenticated().and()
				.formLogin().loginPage("/login").permitAll().and().logout().permitAll()
				.and().rememberMe()
				.rememberMeParameter("rememberme").tokenValiditySeconds(60);

	}

	

}
