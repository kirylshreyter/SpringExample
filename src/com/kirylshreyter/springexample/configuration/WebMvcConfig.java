package com.kirylshreyter.springexample.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.kirylshreyter.springexample.controllers")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

}
