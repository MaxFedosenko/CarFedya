package com.tms.CarFedya.repositories;

import com.tms.CarFedya.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CarRepository extends JpaRepository<Car, Long> {
    
    @Transactional
    @Modifying
    @Query("update Car set client_id = :idClient where id = :idCar")
    void booking(@Param("idClient") Long idClient,
                 @Param("idCar") Long idCar);
    
    @Transactional
    @Modifying
    @Query("update Car set description = :description where id = :id")
    void updateDescription(@Param("description") String description,
                       @Param("id") Long id);
}
