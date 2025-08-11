package controller;

import service.CityService; // ✅ Correct import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String getCityList(Model model) {
        model.addAttribute("cities", cityService.getAllCities());
        return "cities";
    }
}
