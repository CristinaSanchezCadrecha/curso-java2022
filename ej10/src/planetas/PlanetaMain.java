package planetas;

public class PlanetaMain {

	public static void main(String[] args) {
		
//	Planeta mercurio = Planeta.MERCURIO;
//	Planeta venus = Planeta.VENUS;
//	Planeta tierra = Planeta.TIERRA;
//	Planeta marte = Planeta.MARTE;
//	Planeta jupiter = Planeta.JUPITER;
//	Planeta saturno = Planeta.SATURNO;
//	Planeta urano = Planeta.URANO;
//	Planeta neptuno = Planeta.NEPTUNO;
//	En este caso no hace falta meter los nombres asi, xq ya los recuperamos con .name
	
	// Recorre todas las constantes de la enumeración
	for(Planeta planeta: Planeta.values()){
		System.out.print(planeta.name() + " --> " + "Masa = " + planeta.getMasa() +"  Radio = " + planeta.getRadio() + "\n");
	}
	
	System.out.println();

	}

}
