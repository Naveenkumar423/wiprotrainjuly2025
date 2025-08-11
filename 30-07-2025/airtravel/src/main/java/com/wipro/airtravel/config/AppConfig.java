package com.wipro.airtravel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wipro.airtravel")
@EnableAspectJAutoProxy
public class AppConfig {
}
