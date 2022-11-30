package ej13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Persona {
	private int identificador;
	private int edad;
	private String nombre;
	
	

	//Constructors
	public Persona( int identificador, int edad, String nombre) {
		this.identificador = identificador;
		this.edad = edad;
		this.nombre = nombre;
		
	}
	
	public Persona() {
		super();
	
	}




	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, identificador, nombre, persona1, persona2, persona3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && identificador == other.identificador && Objects.equals(nombre, other.nombre)
				&& Objects.equals(persona1, other.persona1) && Objects.equals(persona2, other.persona2)
				&& Objects.equals(persona3, other.persona3);
	}

	@Override
	public String toString() {
		return "Persona [identificador=" + identificador + ", edad=" + edad + ", nombre=" + nombre + ", persona1="
				+ persona1 + ", persona2=" + persona2 + ", persona3=" + persona3 + "]";
	}
	
	
	

}
