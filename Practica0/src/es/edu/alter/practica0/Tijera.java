package es.edu.alter.practica0;

public class Tijera extends PiedraPapelTijeraFactory {
	
	public Tijera() {
		this(TIJERA, "tijera");
	}

	public Tijera(int pNumero, String pNombre) {
		super(pNumero, pNombre);
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == TIJERA;//pNumero el num que e le pasa como parametro
	}							 //Tijera se compara el numero que le asiganamos en el min
								//TIJERA = 3

	@Override
	public int compare(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		
		switch (numeroRecibido) {
		case PIEDRA: 
			result = -1;
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy pierde con nombre que le paso por parametro
			break;
			
		case PAPEL: 
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
