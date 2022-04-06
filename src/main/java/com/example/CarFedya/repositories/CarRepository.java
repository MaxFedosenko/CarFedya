package com.example.CarFedya.repositories;

import com.example.CarFedya.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CarRepository extends JpaRepository<Car, Long> {
    
//    @Query("select c from Car c where c.model = :model")
//    Car findByModel(@Param("model") String model);
    
    @Transactional
    @Modifying
    @Query("update Car set description = :description where id = :id")
    void updateDescription(@Param("description") String description,
                       @Param("id") Long id);
}
