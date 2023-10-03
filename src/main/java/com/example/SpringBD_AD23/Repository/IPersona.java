package com.example.SpringBD_AD23.Repository;

import com.example.SpringBD_AD23.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona, Integer> {

}
