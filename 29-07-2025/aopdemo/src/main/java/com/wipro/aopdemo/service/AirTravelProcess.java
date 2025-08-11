package com.wipro.aopdemo.service;
import com.wipro.aopdemo.exception.*;

import org.springframework.stereotype.Component;

@Component
public class AirTravelProcess {

    public void checkIn(Boolean flag) throws NoSeatAvailableException {
        if (flag) {
            System.out.println("Check-in successful");
        } else {
            throw new NoSeatAvailableException("No seat available for check-in");
        }
    }

    public void collectBoardingPass() {
        System.out.println("Boarding pass collected");
    }

    public void doSecurityCheck() {
        System.out.println("Security check done");
    }

    public void doBoarding() {
        System.out.println("Boarding completed");
    }
}