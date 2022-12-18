package com.crisCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
