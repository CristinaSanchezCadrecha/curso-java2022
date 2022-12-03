package es.edu.alter.practica0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PiedraPapelTijeraFactoryTest {
	
	//Lote de pruebas: Creamos objetos
	PiedraPapelTijeraFactory piedra,
							 papel,
							 tijera,
							 piedra2,
							 papel2,
							 tijera2;

	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel =  new Papel();
		tijera = new Tijera();
		
		piedra2 = new Piedra();
		papel2 = new Papel();
		tijera2 = new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = null;
		papel =  null;
		tijera = null;
		
		piedra2 = null;
		papel2 = null;
		tijera2 = null;
		
	}

	@Test
	void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Piedra);
	}
	
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Tijera);
	}	
	
	@Test
	void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL)instanceof Papel);
	}
	
	@Test
	void testGetInstancePapel_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Tijera);
	}
	
	@Test
	void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Tijera);
	}
	
	
	@Test
	void testGetInstanceTijera_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Papel);
	}
	
	//PIEDRA
	@Test
	void testPiedraGanaTijera() {
		assertEquals(1, piedra.compare(tijera));
	}
	
	@Test
	void testPiedraPierdeConPapel() {
		assertEquals(-1, piedra.compare(papel));
	}
	
	@Test
	void testPiedraEmpataConPiedra() {
		assertEquals(0, piedra2.compare(piedra));
	}
	
	@Test
	void testPiedraGanaDescripcion() {
		piedra.compare(tijera);
		assertEquals("piedra gana a tijera", piedra.getDescripcionResultado());
	}
	
	@Test
	void testPiedraPierdeDescription() {
		piedra.compare(papel);
		assertEquals("piedra pierde con papel", piedra.getDescripcionResultado());
	}
	
	@Test
	void testPiedraEmpataDescription() {
		piedra.compare(piedra2);
		assertEquals("piedra empata con piedra", piedra.getDescripcionResultado());
	}
	
	
	//PAPEL****************************************************************************************************************
	@Test
	void testPapelGanaPiedra() {
		assertEquals(1, papel.compare(piedra));
	}
	
	@Test
	void testPapelPierdeConTijera() {
		assertEquals(-1, papel.compare(tijera));
	}
	
	@Test
	void testPapelEmpataPapel() {
		assertEquals(0, papel.compare(papel2));
	}
	
	
	
	@Test
	void testPapelGanaDescripcion() {
		papel.compare(piedra);
		assertEquals("papel gana a piedra", papel.getDescripcionResultado());
	}
	
	
	@Test
	void testPapelPierdeDescription() {
		papel.compare(tijera);
		assertEquals("papel pierde con tijera", papel.getDescripcionResultado());
	}
	
	@Test
	void testPapelEmpataDescription() {
		papel.compare(papel2);
		assertEquals("papel empata con papel", papel.getDescripcionResultado());
	}
	
	

	//TIJERA*************************************************************************************************************
	@Test
	void testTijeraGanaPapel() {
		assertEquals(1, tijera.compare(papel));
	}
	
	@Test
	void testTijeraPierdeConPiedra() {
		assertEquals(-1, tijera.compare(piedra));
	}

	@Test
	void testTijeraEmpataConTijera() {
		assertEquals(0, tijera.compare(tijera2));
	}
	
	
	
	@Test
	void testTijeraGanaDescripcion() {
		tijera.compare(papel);
		assertEquals("tijera gana a papel", tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeraPierdeDescripcion() {
		tijera.compare(piedra);
		assertEquals("tijera pierde con piedra", tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeraEmpata() {
		tijera.compare(tijera2);
		assertEquals("tijera empata con tijera", tijera.getDescripcionResultado());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
