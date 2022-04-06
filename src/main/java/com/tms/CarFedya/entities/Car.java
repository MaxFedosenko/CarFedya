package com.tms.CarFedya.entities;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Double rate;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
    
    public Car() {
    }
    
    public Car(String model, Double rate, String description) {
        this.model = model;
        this.rate = rate;
        this.description = description;
    }
    
    public Car(Long id, String model, Double rate, String description, Client client) {
        this.id = id;
        this.model = model;
        this.rate = rate;
        this.description = description;
        this.client = client;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public Double getRate() {
        return rate;
    }
    
    public void setRate(Double rate) {
        this.rate = rate;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", rate='" + rate + "BYN" + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
