package com.example.CarFedya.controllers;

import com.example.CarFedya.exceptions.ExistsException;
import com.example.CarFedya.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class StartController {
    
    @Autowired
    ClientService clientService;
    @Autowired
    CarService carService;
    @Autowired
    AuthorizationService authorizationService;
    @Autowired
    RegistrationService registrationService;
    
    @GetMapping
    public String start() {
        return "startpages/homepage";
    }
    
    @GetMapping("/rate")
    public String rate(Model model) {
        model.addAttribute("car", carService.findAll());
        return "startpages/rate";
    }
    
    @GetMapping("/getcars")
    public String getCars(Model model) {
        model.addAttribute("cars", carService.findAll());
        return "startpages/getcars";
    }
    
    @GetMapping("/support")
    public String startSupport() {
        return "startpages/support";
    }
    
    @GetMapping("/contacts")
    public String startContacts() {
        return "startpages/contacts";
    }
    
    @GetMapping("/authorization")
    public String startAuthorization() {
        return "startpages/authorization";
    }
    
    @GetMapping("/registration")
    public String startRegistration() {
        return "startpages/registration";
    }
    
    @GetMapping("/adminregistration")
    public String startAdminRegistration() {
        return "startpages/adminregistration";
    }
    
    @GetMapping("/clientregistration")
    public String startClientRegistration() {
        return "startpages/clientregistration";
    }
    
    @PostMapping("/finalauthorization")
    public String finalStartAuthorization(@RequestParam String login,
                                          @RequestParam String password){
        return authorizationService.authorization(login, password);
    }
    
    @PostMapping("/registrationadmin")
    public String finalStartRegistration(@RequestParam String login,
                                         @RequestParam String password){
        return registrationService.registration(login, password);
    }
    
    @PostMapping("/finalclientregistration")
    public String finalClientRegistration(@RequestParam String name,
                                          @RequestParam String login,
                                          @RequestParam String password,
                                          @RequestParam String numberPhone,
                                          @RequestParam String email){
        return clientService.clientRegistration(name, login, password, numberPhone, email);
    }
    
    @ExceptionHandler(NullPointerException.class)
    public String errorClient(Exception exception, Model model) {
        model.addAttribute("startError", exception.getMessage());
        return "startpages/authorization";
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public String errorAdmin(Exception exception, Model model) {
        model.addAttribute("adminError", exception.getMessage());
        return "startpages/adminregistration";
    }
    
    @ExceptionHandler(ExistsException.class)
    public String clientLoginIsExists(Exception exception, Model model) {
        model.addAttribute("clientError", exception.getMessage());
        return "startpages/clientregistration";
    }
    
}
