package es.edu.alter.practica0;

import java.util.Scanner;

public class JugarMain {

	public static void main(String[] args) {
		System.out.println("Vamos a jugar a Piedra Papel o Tijera");
		
		System.out.println("Introducir un numero: 1-Piedra, 2-Papel, 3-Tijera");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
				
		//El numero que selecciona el ordenador
	
		int numOrdenador = (int)(Math.random()*3 + 1);//Sumamos 1 para que no de cero y llegue hasta 3, nos de o 1 o2 o3
				
		PiedraPapelTijeraFactory eleccionUsuario = PiedraPapelTijeraFactory.getInstance(numero);
		PiedraPapelTijeraFactory eleccionOrdenador = PiedraPapelTijeraFactory.getInstance(numOrdenador);
		
		eleccionUsuario.compare(eleccionOrdenador);
		
		
		System.out.println("\n\nResultado del juego: ");
		System.out.println("Eleccion usuario: " + eleccionUsuario.getNombre());
		System.out.println("Eleccion ordenador: " + eleccionOrdenador.getNombre());
		System.out.println("Resultado: " + eleccionUsuario.getDescripcionResultado());
		
		sc.close();
		
	}

}
