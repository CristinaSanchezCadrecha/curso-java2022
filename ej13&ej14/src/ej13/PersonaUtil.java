package ej13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class PersonaUtil {
	

	public static Map<Integer, Persona> getPersonas(List<Persona> pListPersonas){
			Map<Integer, Persona> personasM = new HashMap<Integer, Persona>();
			Iterator<Persona> it = pListPersonas.iterator(); //Recorrer la lista
			//Persona persona = null;
	
			while(it.hasNext()) {
				Persona persona1 = (Persona) it.next();
				personasM.put(persona1.getIdentificador(), persona1);
			}
			return personasM;
	}
}

