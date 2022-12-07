package ej13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonasTest {
	//Definir lote de prueba
	private Persona homer;
	private Persona marge;
	
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	
	//Definir lista
	List<Persona> listaPersonas;
	

	@BeforeEach
	void setUp() throws Exception {
		
		listaPersonas = new ArrayList<Persona>();
		
		homer = new Persona (1, 45, "Homer");
		marge = new Persona (2, 40, "Marge");
		listaPersonas.add(homer);
		listaPersonas.add(marge);
		
		listaPersonas.add(new Persona(3, 10, "Bart"));
		listaPersonas.add(new Persona(4, 8, "Lisa"));
		listaPersonas.add(new Persona(5, 1, "Maggie"));
		
		//Creamos nuevas personas
		p1 = new Persona(1, 45, "Homer");
		p2 = new Persona(2, 40, "Marge");
		p3 = new Persona(3, 10, "Bart");
		p4 = new Persona(4, 8, "Lisa");
		p5 = new Persona(5, 1, "Maggie");
	}
	

	@AfterEach
	void tearDown() throws Exception {
		homer = null;
		marge = null;
		listaPersonas = null;
	}

	@Test
	void testGetpersonas() {
		Map<Integer, Persona> personasMap = new HashMap<Integer, Persona>();
		
		//Hacer un map con las 5 nuevas personas
		personasMap.put(p1.getIdentificador(), p1);
		personasMap.put(p2.getIdentificador(), p2);
		personasMap.put(p3.getIdentificador(), p3);
		personasMap.put(p4.getIdentificador(), p4);
		personasMap.put(p5.getIdentificador(), p5);
		
		
		//Comparo personasMap con listaPersonas
		assertEquals(personasMap, PersonaUtil.getPersonas(listaPersonas));
		
	}

}
