/*
 * package com.stackroute.moviecruiserapp.util;
 * 
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * 
 * 
 * @EnableWebSecurity public class SecurityConfigurer extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable() .authorizeRequests().
 * antMatchers("/authenticate").permitAll()
 * .antMatchers("/saveregister").permitAll();
 * 
 * }
 * 
 * 
 * 
 * }
 */