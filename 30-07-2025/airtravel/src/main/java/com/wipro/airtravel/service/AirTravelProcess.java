package com.wipro.airtravel.service;

import org.springframework.stereotype.Component;
import com.wipro.airtravel.exception.NoSeatAvailableException;

@Component
public class AirTravelProcess {

    public void checkIn(boolean flag) throws NoSeatAvailableException {
        if (flag) {
            System.out.println("--Check-In Successful--");
        } else {
            throw new NoSeatAvailableException("No seats available.");
        }
    }

    public void collectBoardingPass() {
        System.out.println("--Collecting Boarding Pass--");
    }

    public void doSecurityCheck() {
        System.out.println("--Security Check Done--");
    }

    public void doBoarding() {
        System.out.println("--Boarding Completed--");
    }

	public void bookTicket() {
		// TODO Auto-generated method stub
		
	}

	public void boardFlight() {
		// TODO Auto-generated method stub
		
	}

	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
}
