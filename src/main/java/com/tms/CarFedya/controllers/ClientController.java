package com.tms.CarFedya.controllers;

import com.tms.CarFedya.exceptions.BookingException;
import com.tms.CarFedya.exceptions.CarException;
import com.tms.CarFedya.exceptions.InvalidDataInput;
import com.tms.CarFedya.exceptions.LoginIsNotExists;
import com.tms.CarFedya.services.CarService;
import com.tms.CarFedya.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public class ClientController {
    
    private final String prefix = "clientpages/";
    
    @Autowired
    CarService carService;
    @Autowired
    ClientService clientService;
    
    @GetMapping
    public String homePage() {
        return prefix + "clienthome";
    }
    
    
    @GetMapping("/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("counter", carService.findAll().size());
        return prefix + "getcars";
    }
    
    @GetMapping("/beforebooking")
    public String beforeBooking(Model model) {
        model.addAttribute("cars", carService.findAll());
        return prefix + "beforebooking";
    }
    
    @PostMapping("/booking")
    public String booking(@RequestParam Long carId,
                            @RequestParam String login) {
        clientService.booking(carId, login);
        return prefix + "booking";
    }
    
    @GetMapping("/beforecardpayment")
    public String beforeCardPayment(){
        return prefix + "beforecardpayment";
    }
    
    @PostMapping("/cardpayment")
    public String cardPayment() {
        return prefix + "cardpayment";
    }
    
    @GetMapping("/rate")
    public String rate(Model model) {
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("counter", carService.findAll().size());
        return prefix + "rate";
    }
    
    @GetMapping("/beforecalculate")
    public String beforeCalculate(Model model) {
        model.addAttribute("cars", carService.findAll());
        return prefix + "beforecalculate";
    }
    
    @PostMapping("/calculate")
    public String calculate(@RequestParam Long id,
                                 @RequestParam Double timeRent, Model model) {
        model.addAttribute("result", carService.calculate(id, timeRent));
        return prefix + "calculate";
    }
    
    @GetMapping("/support")
    public String support() {
        return prefix + "support";
    }
    
    @GetMapping("/contacts")
    public String contacts() {
        return prefix + "contacts";
    }
    
    @ExceptionHandler({InvalidDataInput.class, LoginIsNotExists.class, BookingException.class})
    public String exc(CarException exception, Model model) {
        model.addAttribute("exc", exception.getMessage());
        model.addAttribute("cars", carService.findAll());
        return prefix + exception.getViewName();
    }
    
}
