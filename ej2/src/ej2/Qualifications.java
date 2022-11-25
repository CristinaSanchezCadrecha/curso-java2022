package ej2;

import java.util.Scanner;

public class Qualifications {

	public static void main(String[] args) {
		
		System.out.println("Introduce tu nota: ");
		Scanner sc = new Scanner(System.in);
		int qualification = sc.nextInt();
	
		if(qualification >= 0 && qualification <= 50) {
			System.out.println("Suspenso");
		}
		else if (qualification > 50 && qualification <= 75) {
			System.out.println("Recuperar");
		}
		else if (qualification > 75 && qualification <= 90) {
			System.out.println("Aprobado");
		}
		else if (qualification > 91 && qualification <= 100) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Puntuacion invalida");
		}
			
	}

}
