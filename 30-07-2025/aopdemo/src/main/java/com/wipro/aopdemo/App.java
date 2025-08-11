package com.wipro.aopdemo;
import com.wipro.aopdemo.service.AirTravelProcess;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo.config.AspectConfig;

public class App {
    public static void main(String[] args) {
       
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        
    	ctx.scan("com.wipro.aopdemo.*");
    	ctx.refresh();
    	AirTravelProcess atp = ctx.getBean(AirTravelProcess.class);

        try {
            atp.checkIn(false);  // Pass true or false to simulate
            atp.collectBoardingPass();
            atp.doSecurityCheck();
            atp.doBoarding();
        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }
    }
}