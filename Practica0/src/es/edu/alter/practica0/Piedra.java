package es.edu.alter.practica0;

public class Piedra extends PiedraPapelTijeraFactory {
	
					   //El objeto se crea de arriba a abajo
	public Piedra() { //El const vacio llama al const con parametros
		this(PIEDRA, "piedra");//PIEDRA es 1 (int) "piedra" el valor del texto String
	}

	public Piedra(int pNumero, String pNombre) {
		super(pNumero, pNombre);//Llama al const del padre(PiedraPapelTijeraFactory)
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == PIEDRA;
	}

	@Override
	public int compare(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		//TODO CUANDO TENGAMOS LAS 3 CLASES
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		
		switch (numeroRecibido) {
		case PAPEL: //Si piedra recibe papel pierde
			result = -1;
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy pierde con nombre que le paso por parametro
			break;
			
		case TIJERA: 
			result = 1;
			descripcionResultado = nombre + " gana a " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy pierde con nombre que le paso por parametro
			break;
			
		default: 
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy pierde con nombre que le paso por parametro
			break;
		}
		
		return result;
				
	}      

}
