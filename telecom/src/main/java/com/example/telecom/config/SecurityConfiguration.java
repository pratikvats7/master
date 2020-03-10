package com.example.telecom.config;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;



@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter 
{
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
          .withUser("pratik").password(passwordEncoder().encode("pratik123")).authorities("ROLE_ADMIN");
    }
 
    @Override 
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().authorizeRequests()//enabling CORS in security
          .antMatchers("/").permitAll()
          .anyRequest().authenticated()//only authentication and no authorization is required
          .and(). 
          httpBasic().and()
          .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER).and().csrf().disable();
          }
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    //To dilute the Spring security firewall - for the purpose of supporting matrix parameters here
    @Bean
    public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowUrlEncodedSlash(true);
        firewall.setAllowSemicolon(true);
        return firewall;
    }
    
 
	
	
}




