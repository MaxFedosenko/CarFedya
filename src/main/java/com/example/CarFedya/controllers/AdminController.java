package com.example.CarFedya.controllers;

import com.example.CarFedya.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    CarService carService;
    
    @GetMapping
    public String adminHomePage() {
        return "adminpages/adminhome";
    }
    
    @GetMapping("/startcrud")
    public String startCrud(Model model) {
        model.addAttribute("crud", carService.findAll());
        return "adminpages/startcrud";
    }
    
    @GetMapping("/startcreate")
    public String startCreateCar() {
        return "adminpages/startcreate";
    }
    
    @GetMapping("/updatecar")
    public String startUpdateCar(Model model) {
        model.addAttribute("forUpdate", carService.findAll());
        return "adminpages/startupdate";
    }
    
    @GetMapping("/deletecar")
    public String startDeleteCar(Model model) {
        model.addAttribute("all", carService.findAll());
        return "adminpages/deletecar";
    }
    
    @PostMapping("/finalcreate")
    public String finalCreateCar(@RequestParam(required = false) String modelCar,
                                 @RequestParam(required = false) Double rate,
                                 @RequestParam(required = false) String description,
                                 Model model) {
        model.addAttribute("saved", carService.save(modelCar, rate, description));
        return "adminpages/finalcreate";
    }
    
    @PostMapping("/finaldelete")
    public String deleteCar(@RequestParam(required = false) Long id, Model model) {
        model.addAttribute("deleted", carService.delete(id));
        return "adminpages/finaldelete";
    }
    
    @PostMapping("/finalupdate")
    public String updateCar(@RequestParam String description,
                            @RequestParam Long id) {
        return  carService.updateDescription(description, id);
    }
}
