package ejercicio9;

import java.util.Date;

//import java.util.Objects;

public class Employee {
		private Date fechaIngreso;
		private double salario;
		private String nombre;
		private int edad;
		
		
		//CONSTRUCTORES
		public Employee() {
			nombre = "";//EL nombre nunca va a estar nunca nulo
			fechaIngreso = new Date();//Fecha tampoco null
		}
		
		public Employee(Date fechaIngreso, double salario, String nombre, int edad) {
			super();
			setFechaIngreso(fechaIngreso);
			this.salario = salario;
			setNombre(nombre);
			this.edad = edad;
		}
		


		//GETTERS & SETTERS
		public Date getFechaIngreso() {
			return fechaIngreso;
		}
		
		public void setFechaIngreso(Date fechaIngreso) {
			if(fechaIngreso == null)
			   fechaIngreso = new Date();
			else
				this.fechaIngreso = fechaIngreso;
		}
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			if (nombre == null)//Cuando se cree el objeto nos aseguramos que no va ser null
				nombre = "";//"" tiene hasCode
			else
				this.nombre = nombre;
		}
		
		public int getEdad() {
			return edad;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		
		@Override
		public int hashCode() {
			 return 
				 7 * nombre.hashCode() +
				 11 * new Double(salario).hashCode() +
			 	 13 * fechaIngreso.hashCode() +
			 	 31 * new Integer(edad).hashCode();
		}
		
//		@Override
//		public boolean equals(Object obj) {
//			boolean bln = false;
//			
//			if(obj instanceof Employee) {
//				Employee fig =(Employee)obj;
//				bln =fig.getNombre() !=null && 
//					 fig.getNombre().equals(nombre);
//			}
//			return bln;
//		}
		
		@Override
		public boolean equals(Object obj) {
			Employee different = (Employee) obj;
			return
					edad == different.getEdad() &&	
					fechaIngreso.equals(different.fechaIngreso) &&
					nombre.equals(different.getNombre()) &&
					salario == different.getSalario();		
		}
		
		
		

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(super.toString());
			sb.append("Nombre: ");
			sb.append(nombre);
			sb.append("Fecha Ingreso: ");
			sb.append(fechaIngreso);
			sb.append("Salario: ");
			sb.append(salario);
			sb.append("Edad");
			sb.append(edad);
			
			return sb.toString();
		}

}
