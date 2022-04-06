package com.example.CarFedya.services;

import com.example.CarFedya.entities.Client;
import com.example.CarFedya.exceptions.ExistsException;
import com.example.CarFedya.repositories.CarRepository;
import com.example.CarFedya.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    Validator validator;
    @Autowired
    CarRepository carRepository;
    
    @Override
    public Client findByLogin(String login) {
        return clientRepository.findByLogin(login);
    }
    
    @Override
    public String booking(Long carId, String login) {
        validator.bookingValidator(carId);
        Long idCar = carRepository.findById(carId).get().getId();
        Client client = clientRepository.findByLogin(login);
        if (client == null) {
            throw new ExistsException("Клиента с таким логином не существует!");
        }
        clientRepository.booking(client.getId(), idCar);
        return "clientpages/finalbooking";
    }
    
    
    @Override
    public String clientRegistration(String name, String login, String password, String numberPhone, String email) {
        Client client = clientRepository.findByLogin(login);
        if (client == null){
            clientRepository.save(new Client(name, login, password, numberPhone, email));
            return "startpages/finalclientregistration";
        } else {
            throw new ExistsException("Клиент с таким логином уже существует");
        }
    }
}
