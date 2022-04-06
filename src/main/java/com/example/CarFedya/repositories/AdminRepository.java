package com.example.CarFedya.repositories;

import com.example.CarFedya.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends JpaRepository<Admin, String> {
    
    @Query("select a from Admin a where a.login = :login")
    Admin findByLogin(@Param("login") String login);
    
}
