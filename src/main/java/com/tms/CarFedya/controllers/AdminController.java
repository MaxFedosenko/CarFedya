package com.tms.CarFedya.controllers;

import com.tms.CarFedya.entities.Car;
import com.tms.CarFedya.exceptions.*;
import com.tms.CarFedya.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    private final String prefix = "adminpages/";
    
    @Autowired
    CarService carService;
    
    @GetMapping
    public String adminHomePage() {
        return prefix + "adminhome";
    }
    
    @GetMapping("/carsoperation")
    public String carsOperation() {
        return prefix + "carsoperation";
    }
    
    @GetMapping("/beforecreate")
    public String beforeCreateCar() {
        return prefix + "beforecreate";
    }
    
    @GetMapping("/beforeupdate")
    public String beforeUpdateCar(Model model) {
        model.addAttribute("cars", carService.findAll());
        return prefix + "beforeupdate";
    }
    
    @GetMapping("/beforedelete")
    public String beforeDeleteCar(Model model) {
        model.addAttribute("cars", carService.findAll());
        return prefix + "beforedelete";
    }
    
    @PostMapping("/create")
    public String createCar(@Valid Car car, BindingResult result, Model model) {
        if (result.hasErrors()) {
            throw new CarFieldsException("заполните все поля");
        }
        model.addAttribute("car", carService.save(car));
        return prefix + "create";
    }
    
    @PostMapping("/delete")
    public String deleteCar(@RequestParam Long id) {
        carService.delete(id);
        return prefix + "delete";
    }
    
    @PostMapping("/update")
    public String updateCar(@RequestParam String description,
                            @RequestParam Long id) {
        carService.updateDescription(description, id);
        return prefix + "update";
    }
    
    @ExceptionHandler({ClientFieldsException.class, InvalidRateException.class, DescriptionException.class})
    public String exc(CarException exception, Model model) {
        model.addAttribute("exc", exception.getMessage());
        model.addAttribute("cars", carService.findAll());
        return prefix + exception.getViewName();
    }
    
}
