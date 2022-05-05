package com.tms.CarFedya.controllers;

import com.tms.CarFedya.entities.Client;
import com.tms.CarFedya.exceptions.*;
import com.tms.CarFedya.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class StartController {
    
    private final String prefix = "startpages/";
    
    @Autowired
    ClientService clientService;
    @Autowired
    CarService carService;
    @Autowired
    AuthorizationService authorizationService;
    
    @GetMapping
    public String start() {
        return prefix + "homepage";
    }
    
    @GetMapping("/rate")
    public String rate(Model model) {
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("counter", carService.findAll().size());
        return prefix + "rate";
    }
    
    @GetMapping("/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.findAll());
        model.addAttribute("counter", carService.findAll().size());
        return prefix + "getcars";
    }
    
    @GetMapping("/support")
    public String support() {
        return prefix + "support";
    }
    
    @GetMapping("/contacts")
    public String contacts() {
        return prefix + "contacts";
    }
    
    @GetMapping("/beforeauthorization")
    public String beforeAuthorization() {
        return prefix + "authorization";
    }
    
    @GetMapping("/beforeclientregistration")
    public String beforeClientRegistration() {
        return prefix + "beforeclientregistration";
    }
    
    @PostMapping("/authorization")
    public String authorization(@RequestParam String login,
                                          @RequestParam String password){
        return authorizationService.authorization(login, password);
    }
    
    @PostMapping("/clientregistration")
    public String clientRegistration(@Valid Client client, BindingResult result){
        if (result.hasErrors()){
            throw new ClientFieldsException("заполните все поля");
        }
        clientService.clientRegistration(client);
        return prefix + "clientregistration";
    }
    
    @ExceptionHandler({WrongLoginOrPassword.class, LoginIsExists.class, ClientFieldsException.class, RoleIsNotSelected.class})
    public String exc(CarException exception, Model model) {
        model.addAttribute("exc", exception.getMessage());
        return prefix + exception.getViewName();
    }
    
}
