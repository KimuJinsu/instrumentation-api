package com.jinsu.aspectjconfigure.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@EnableSpringConfigured
@EnableLoadTimeWeaving/*(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.AUTODETECT)*/
@ComponentScan(basePackages = "com.jinsu.aspectjconfigure")
public class AppConfig {
	
}
