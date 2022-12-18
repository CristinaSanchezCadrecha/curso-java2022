package com.crisCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
	
	//Atributos
	
	@Id
	private int codigo;
	
	@Column(name="PER_NOMBRE", length = 50)
	private String nombre;
	
	
	//Constructores
	public Persona(int pCod, String pNom) {
		codigo = pCod;
		nombre = pNom;
	}
	
	public Persona() {
		
	}
	
	
	//GEtters & Setters
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
