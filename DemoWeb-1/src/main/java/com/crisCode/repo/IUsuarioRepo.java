package com.crisCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crisCode.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	//Usuario findByNombre(String username);//

}
