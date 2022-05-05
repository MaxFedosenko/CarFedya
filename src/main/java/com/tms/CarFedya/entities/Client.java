package com.tms.CarFedya.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String role;
    @NotBlank
    private String name;
    @NotBlank
    private String login;
    @NotBlank
    private String password;
    @NotBlank
    private String numberPhone;
    @NotBlank
    private String email;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> cars;
    
    public Client() {
    }
    
    public Client(String role, String name, String login, String password, String numberPhone, String email) {
        this.role = role;
        this.name = name;
        this.login = login;
        this.password = password;
        this.numberPhone = numberPhone;
        this.email = email;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNumberPhone() {
        return numberPhone;
    }
    
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Car> getCars() {
        return cars;
    }
    
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                ", cars=" + cars +
                '}';
    }
}
