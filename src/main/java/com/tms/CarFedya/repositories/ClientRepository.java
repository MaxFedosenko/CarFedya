package com.tms.CarFedya.repositories;

import com.tms.CarFedya.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
    Client findByLogin(String login);
    
}
