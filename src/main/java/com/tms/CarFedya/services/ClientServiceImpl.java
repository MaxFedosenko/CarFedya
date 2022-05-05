package com.tms.CarFedya.services;

import com.tms.CarFedya.entities.Client;
import com.tms.CarFedya.exceptions.LoginIsExists;
import com.tms.CarFedya.exceptions.LoginIsNotExists;
import com.tms.CarFedya.repositories.CarRepository;
import com.tms.CarFedya.repositories.ClientRepository;
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
    public void booking(Long carId, String login) {
        Client client = clientRepository.findByLogin(login);
        if (client == null) {
            throw new LoginIsNotExists("Клиента с таким логином не существует!");
        }
        validator.validate(carId);
        Long idCar = carRepository.findById(carId).get().getId();
        carRepository.booking(client.getId(), idCar);
    }
    
    
    @Override
    public void clientRegistration(Client client) {
        validator.validate(client);
        String login = client.getLogin();
        Client clientByLogin = clientRepository.findByLogin(login);
        if (clientByLogin == null) {
            clientRepository.save(client);
        } else {
            throw new LoginIsExists("Клиент с таким логином уже существует");
        }
    }
}
