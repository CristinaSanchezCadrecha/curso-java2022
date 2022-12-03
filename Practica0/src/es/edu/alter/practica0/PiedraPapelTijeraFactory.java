package es.edu.alter.practica0;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
	//Se podría hacer un enum de Piedra, Papel ,Tijera

	public static final int PIEDRA = 1;//lAS HACEMOS CONSTANTES
	public static final int PAPEL  = 2;//Con el final no se puede modificar
	public static final int TIJERA = 3;
	public static final int LAGARTO = 4;
	public static final int SPOK = 5;
	
	
	//ATRIBUTOS
	protected String descripcionResultado;
	private static List<PiedraPapelTijeraFactory> elementos;
	protected String nombre;
	protected int numero;
	
	//CONSTRUCTOR
	public PiedraPapelTijeraFactory(int pNumero, String pNombre) {
		super();
		this.numero = pNumero;
		this.nombre = pNombre;
	}
	
	//GETTERS & SETTERS (ACCESOS)
	public String getNombre() { 
		return nombre;
	}
	
	public void setNombre(String nombre) { 
		this.nombre = nombre;
	}

	public int getNumero() { 
		return numero;
	}
	
	public void setNumero(int numero) { 
		this.numero = numero;
	}

	public String getDescripcionResultado() { 
		return descripcionResultado;
	}
	
	//METODOS DE NEGOCIOS
	public abstract boolean isMe(int pNumero);
	public abstract int compare(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory);//Le pasamos el tipo y el parametro
	
	public static PiedraPapelTijeraFactory getInstance(int pNumero) {//Devuelve tipo PiedraPapelTijeraFactory, 
		//El padre conoce a todos sus hijos
		elementos  = new ArrayList<PiedraPapelTijeraFactory>();//Hacemos un arrayList
		elementos.add(new Piedra());//Añadimos los elementos
		elementos.add(new Papel());
		elementos.add(new Tijera());
		//elementos.add(new Lagarto());
		//elementos.add(new Spok());
		
		//Recorrer el arrayList con un for each
		 for(PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			 if(piedraPapelTijeraFactory.isMe(pNumero));//A cada elemento le va a preguntar si es el que esta buscasdo Eres Piedra,Papel ,tijera
			 	return piedraPapelTijeraFactory;
		 }
		 return null;//Si  no encontro ninguno, devuelve nulo
		 
	}
	
	
	
}
