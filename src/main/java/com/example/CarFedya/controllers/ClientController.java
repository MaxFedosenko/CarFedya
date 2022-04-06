package com.example.CarFedya.controllers;

import com.example.CarFedya.exceptions.ExistsException;
import com.example.CarFedya.services.CarService;
import com.example.CarFedya.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public class ClientController {
    
    @Autowired
    CarService carService;
    @Autowired
    ClientService clientService;
    
    @GetMapping
    public String homePage() {
        return "clientpages/clienthome";
    }
    
    
    @GetMapping("/getcars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.findAll());
        return "clientpages/getcars";
    }
    
    @GetMapping("/booking")
    public String booking(Model model) {
        model.addAttribute("booking", carService.findAll());
        return "clientpages/booking";
    }
    
    @PostMapping("/finalbooking")
    public String finalBooking(@RequestParam Long carId,
                            @RequestParam String login) {
        return clientService.booking(carId, login);
    }
    
    @GetMapping("/cardpayment")
    public String cardPayment(){
        return "clientpages/cardpayment";
    }
    
    @PostMapping("/finalcardpayment")
    public String finalCardPayment() {
        return "clientpages/finalcardpayment";
    }
    
    @GetMapping("/rate")
    public String rate(Model model) {
        model.addAttribute("car", carService.findAll());
        return "clientpages/rate";
    }
    
    @GetMapping("/calculate")
    public String calculate(Model model) {
        model.addAttribute("cars", carService.findAll());
        return "clientpages/calculate";
    }
    
    @PostMapping("/finalcalculate")
    public String finalCalculate(@RequestParam Long id,
                                 @RequestParam Double timeRent, Model model) {
        model.addAttribute("result", carService.calculate(id, timeRent));
        return "clientpages/finalcalculate";
    }
    
    @GetMapping("/support")
    public String support() {
        return "clientpages/support";
    }
    
    @GetMapping("/contacts")
    public String contacts() {
        return "clientpages/contacts";
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public String errorCalculate(Exception exception, Model model) {
        model.addAttribute("errorCalculate", exception.getMessage());
        model.addAttribute("cars", carService.findAll());
        return "clientpages/calculate";
    }
    
    @ExceptionHandler({NumberFormatException.class, ExistsException.class})
    public String errorBooking(Exception exception, Model model) {
        model.addAttribute("errorBooking", exception.getMessage());
        model.addAttribute("booking", carService.findAll());
        return "clientpages/booking";
    }
    
}
