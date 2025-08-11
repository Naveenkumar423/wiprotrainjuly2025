package com.wipro.airtravel;

import com.wipro.airtravel.config.AppConfig;
import com.wipro.airtravel.service.AirTravelProcess;
import com.wipro.airtravel.exception.NoSeatAvailableException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AirTravelProcess process = context.getBean(AirTravelProcess.class);

        try {
            process.bookTicket();
            process.checkIn(true);  // Try false to simulate exception
            process.boardFlight();
            process.takeOff();
        } catch (NoSeatAvailableException e) {
            System.out.println("❌ Exception handled in main: " + e.getMessage());
        }
    }
}
