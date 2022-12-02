package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMonth {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		 int date = 0; 
		 int day_max = 0; 
		 int year = 0; 
		 int mes = 0; 
		
		Scanner in = new Scanner(System.in);
		System.out.print ("Introducir año:");
		year = in.nextInt();
		System.out.print ("Introducir mes:");
		mes = in.nextInt();
		System.out.println ("La fecha introducida es:" + year + "-" + mes);
		in.close();
		
		 //Mes en el 1 del mes siguiente, y el día anterior, obtenga primero la cantidad de días en el mes actual
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(Calendar.DATE, -1);
		day_max = calendar.get(Calendar.DATE);
		
		 //La hora en 1 nuevamente, que es el día de la semana, el domingo es 0, el lunes es 1, y así sucesivamente
		calendar.add(Calendar.DATE, - (day_max -1));
		date = calendar.get(Calendar.DAY_OF_WEEK) + 1;
		
		System.out.println(calendar.getTime());
		printfCalendar(date, day_max);
	}
	
	public static void printfCalendar(int start, int day_max) {
		Calendar calendar1 = Calendar.getInstance();
		 
		System.out.println("Mon    Tue     Wed     Thu     Fri     Sat     Sun");
		
		
		 int day = 1; // número de días para imprimir
		 for (int i = 0; i < 6; i++) { //month: 
			for (int j = 0; j < 7; j++) {
				 // Al imprimir la primera línea, vacíe el espacio antes del inicio
				if (i == 0 && j < start) {
					System.out.print("\t");
					 // fuera del ciclo actual
					continue;
				}
				
				if (day > day_max) {
					System.out.println();
					break ;
				}
				System.out.print(day + "\t");
				day++;
				
				if (day_max == calendar1.get(Calendar.DAY_OF_MONTH)) {
					System.out.print("*");
				}
			}
			 // Ajustar después de imprimir una línea
			System.out.println();
		} // for month
		
	}


//Resultado de la operación:

}
