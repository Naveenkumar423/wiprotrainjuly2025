package com.wipro.springmvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.springmvc.service.CarService;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/list")
    public String showCarList(Model model) {
        List<String> cars = carService.getCarList();
        model.addAttribute("carList", cars);
        return "carlist";  // Maps to /WEB-INF/views/carlist.jsp
    }
}
