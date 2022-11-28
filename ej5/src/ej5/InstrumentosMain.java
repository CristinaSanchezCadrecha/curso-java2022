package ej5;

public class InstrumentosMain {

	public static void main(String[] args) {
		Instrumento[] orquesta = new Instrumento[3];
		
		int i = 0;
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Oboe();
		
		sonar(orquesta);
	}
}

	
