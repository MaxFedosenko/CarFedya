package com.tms.CarFedya.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;
    private String numberPhone;
    private String email;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> cars;
    
    public Client() {
    }
    
    public Client(String name, String login, String password, String numberPhone, String email) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.numberPhone = numberPhone;
        this.email = email;
    }
    
    public Client(Long id, String name, String login, String password,
                  String  numberPhone, String email, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.numberPhone = numberPhone;
        this.email = email;
        this.cars = cars;
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
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                ", cars=" + cars +
                '}';
    }
}
