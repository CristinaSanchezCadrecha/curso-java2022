package ej4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiPilaTest extends MiPila{
	
	MiPila pila;

	@BeforeEach
	void setUp() throws Exception {
		pila = new MiPila();
		pila.push("Uno");
		pila.push("Dos");
		pila.push("Tres");
		pila.push("Cuatro");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		pila = null;
	}

	@Test
	void testPop() {
		assertEquals("Cuatro", pila.pop());
	}
	

	@Test
	void testPush() {
		pila.push("Cinco");
		assertEquals(5, pila.getList().size());
	}
	
	@Test
	void testPeek() {
		assertEquals("Cuatro", pila.peek());
		assertEquals(4, pila.getList().size());
	}
	
	
	
	

}
