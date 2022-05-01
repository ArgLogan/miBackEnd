package com.miPorfolio.porfback.repository;

import com.miPorfolio.porfback.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
