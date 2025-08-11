package com.wipro.aopdemo.aspect;
import com.wipro.aopdemo.exception.*;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))")
    public void showPhotoId() {
        System.out.println("[Advice] Please show your Photo ID before check-in");
    }

    @Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.aopdemo.service.AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println("[Advice] Please show your Boarding Pass");
    }

    @AfterThrowing(pointcut = "execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))", throwing = "ex")
    public void handleNoSeatException(NoSeatAvailableException ex) {
        System.out.println("[Exception Advice] " + ex.getMessage());
    }
}