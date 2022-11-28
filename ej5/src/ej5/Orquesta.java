package ej5;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Orquesta {

	Instrumento guitarra = new Guitarra("Marca1", "Mdelo1");                         
	Instrumento piano = new Piano("Marca 2", "Modelo 2");
	Instrumento oboe  = new Oboe("Marca 3", "Modelo 3");        

	public void concierto() {

       // guitarra = new Guitarra("marca1", "modelo1");
		

		ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
		instrumentos.add(guitarra);
		instrumentos.add(piano);
		instrumentos.add(oboe);

		for (int i = 0; i < instrumentos.size(); i++)
			instrumentos.get(i).Sonar();
	}

	public static void main(String[] args) {
		Orquesta orquesta1 = new Orquesta();
		orquesta1.concierto();

	}

}
