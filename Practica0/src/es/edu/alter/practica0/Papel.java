package es.edu.alter.practica0;

public class Papel extends PiedraPapelTijeraFactory {

	//CONSTRUCTORS
	public Papel(){
		this(PAPEL, "papel");
	}
	
	public Papel(int pNumero, String pNombre) {
		super(pNumero, pNombre);
	}

	@Override
	public boolean isMe(int pNumero) {	
		return pNumero == PAPEL;
	}

	@Override
	public int compare(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		
		switch (numeroRecibido) {
		case TIJERA: 
			result = -1;
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy pierde con nombre que le paso por parametro
			break;
			
		case PIEDRA: 
			result = 1;
			descripcionResultado = nombre + " gana a " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy gana nombre que le paso por parametro
			break;
			
		default: 
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijeraFactory.getNombre();//Nombre clase en la que estoy empata con nombre que le paso por parametro
			break;
		}
		
		return result;
	}

}
