package ej5;

public abstract class Instrumento {
	private String marca;
	private String modelo;
	
	//METODOS DE NEGOCIO
		public abstract void Sonar();
	
	//CONSTRUCTORES
	public Instrumento() {
		super();
	}
	
	public Instrumento(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
//	//GETTERS & SETTERS
//	public String getMarca() {
//		return marca;
//	}
//
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public String getModelo() {
//		return modelo;
//	}
//
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//
//	public String getSonido() {
//		return sonido;
//	}
//
//	public void setSonido(String sonido) {
//		this.sonido = sonido;
//	}
//	
//	
	
	

}
