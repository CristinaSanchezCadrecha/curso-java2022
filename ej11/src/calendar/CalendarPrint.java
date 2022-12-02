package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarPrint {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1985, Calendar.JULY, 19);//Asignamos a cal
		
		//cal.add(Calendar.MONTH , 3);
		//cal.add(Calendar.DATE, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Fecha de mi cumple " + sdf.format(cal.getTime()));
		
		System.out.println("Datos a obtener:");
		System.out.println("Año de nacimiento: " + cal.get(Calendar.YEAR));
		System.out.println("Mes de nacimiento: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("Dia de nacimiento: " + cal.get(Calendar.DATE));
		System.out.println("Dia de la semana nacimiento: " + cal.get(Calendar.DAY_OF_WEEK));//Empieza en 1 desde el Domingo
		
		System.out.println("Ultimo dia de mes fue: " + getUltimoDiaMes(Calendar.JULY,1985));
		
//		System.out.println("Introducir año: ");
//		Scanner sc = new Scanner(System.in);
//		int anio = sc.nextInt();
//		
//		System.out.println("Introducir mes: ");
//		int mes = sc.nextInt();
//		
//		System.out.println("Introducir dia: ");
//		int dia = sc.nextInt();
//		
//		calendarPrint(anio, mes, dia);
//		
//		sc.close();
	}
	
	public static void calendarPrint(int pMes, int pAnio, int pDiaResaltar) {
		
		
	}
	
	private static int getUltimoDiaMes(int pMes, int pAnio) {
		Calendar cal = Calendar.getInstance();
		cal.set(pAnio, pMes, 1);
		int ultimoDia = 1;
		
		while(cal.get(Calendar.MONTH) == pMes) {
			ultimoDia = cal.get(Calendar.DATE);
			cal.add(Calendar.DATE, 1);
		}
		
		return ultimoDia;
	}
			

}


