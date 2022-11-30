package planetas;

public enum Planeta {
	/*Los enum no son Strings (aunque pueden serlo),
	 son objeto de una clase que solo son instanciables desde la clase que se implementa y que no 
	 se puede crear un objeto de esa clase desde cualquier otro lado que no sea dentro de esa clase. 
	 una lista finita de objetos de una determinada clase con sus atributos,
	 constructor y métodos getter aunque estos sean privados.
	 */
	
	MERCURIO (3.303e+23, 2.4397e6),
	VENUS (4.869e+24, 6.0518e6),
	TIERRA(5.976e+24, 6.37814e6),
	MARTE(6.421e+23,3.3972e6),
	JUPITER(1.9e+27, 7.1492e7),
	SATURNO(5.688e+26, 6.0268e7),
	URANO(8.686e+25,2.5559e7),
	NEPTUNO(1.024e+26, 2.4746e7);
	
	
	//ATRIBUTOS
	private double masa;
	private double radio;

	
	//GETTERS & SETTERS
	private Planeta(double pMasa, double pRadio) {
		this.masa = pMasa;
		this.radio = pRadio;
	}
	
	//METODOS
	public double getMasa() {
		return masa;
	}
	
	public double getRadio() {
		return radio;
	}
}


