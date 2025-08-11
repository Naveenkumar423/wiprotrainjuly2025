package com.wipro.WeatherApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, @RequestParam String day) {
        return "Weather in " + city + " for " + day + " is cloudy.";
    }
}
