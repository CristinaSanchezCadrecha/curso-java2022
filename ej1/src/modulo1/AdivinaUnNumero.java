package modulo1;

import java.util.Scanner;

public class AdivinaUnNumero {

	public static void main(String[] args) {
		// 1 El ordenador elige un numero entre 0 y 100
		// 2 El participante ingresa un numero
		// 3 El sistema debe indicar si el numero ingresado es mayor o menor al elegido
		// por el ordenador
		// 4 Contar los intentos
		// Nota: Utilizar bucles
		// Al finalizar felicitar y mostrar en cuantos intentos lo logrogo

		Scanner sc = new Scanner(System.in);

		int numeroIngresado;
		int numeroAleatorio = (int)(Math.random() * 100);
		int contador = 0;

		do {
			System.out.println("Ingrese un numero");
			numeroIngresado = sc.nextInt();

			if (numeroAleatorio > numeroIngresado) {
				System.out.println("El numero es mayor");
			} else if (numeroAleatorio < numeroIngresado) {
				System.out.println("El numero es menor");
			}

			contador++;

		} while (numeroAleatorio != numeroIngresado);

		System.out.println("Felicidades" + contador);

	}

}
