package com.crisCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Usuario {
	
	//Atributos
	
	@Id
	private int codigo;
	
	@Column(name="CLAVE", length = 250)
	private String clave;
	
	
	@Column(name="NOMBRE", length = 250)
	private String nombre;
	
	
	

	//Constructores
	
	public Usuario() {
		
	}

	public Usuario(int pCodigo, String pNombre, String pClave) {
		pCodigo = codigo;
		pNombre = nombre;
		pClave = clave;
	}


	public Usuario(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	



	
	
	
	

}
