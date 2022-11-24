package modulo1;

import java.util.Scanner;

/**
 * 
 * @author mariacsa
 * Ejemplo de ingreso de datos y operaciones
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String("Hola");
		
		System.out.println("Ingrese un numero");
		
		int i = sc.nextInt();
		
		int nro = (int)(Math.random()*100); //Casteamos el math.random, xq devuelve double
		System.out.println("Loteria: " + nro);
		if(nro==i)
			System.out.println("Ganaste");
		else
			System.out.println("Sigue jugando");
	}

}
