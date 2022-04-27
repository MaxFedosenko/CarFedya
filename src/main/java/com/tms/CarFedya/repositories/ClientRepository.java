package com.tms.CarFedya.repositories;

import com.tms.CarFedya.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ClientRepository extends JpaRepository<Client, String> {
    
    @Query("select c from Client c where c.login = :login")
    Client findByLogin(@Param("login") String login);
    
    @Transactional
    @Modifying
    @Query("update Car set client_id = :idClient where id = :idCar")
    void booking(@Param("idClient") Long idClient,
                           @Param("idCar") Long idCar);
    
}
