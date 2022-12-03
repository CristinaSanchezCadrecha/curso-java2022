package ej12;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetOperatorsTest {
	Set<String> setStrA;
	Set<String> setStrB;
	
	Set<Integer> setInteA;
	Set<Integer> setInteB;

	@BeforeEach
	void setUp() throws Exception {
		setStrA = new HashSet<String>();
		setStrA.add("Patricia");
		setStrA.add("Lucy");
		setStrA.add("Paz");
		setStrA.add("Cristina");
		
		setStrB = new HashSet<String>();
		setStrB.add("Patricia");
		setStrB.add("Lucy");
		setStrB.add("Paz");
		setStrB.add("Cristina");
		setStrB.add("Viviana");
		setStrB.add("Marta");
		setStrB.add("Nerea");
		setStrB.add("Marina");
		setStrB.add("Gabriel");
		
		setInteA = new HashSet<Integer>();
		setInteA.add(1);
		setInteA.add(2);
		setInteA.add(3);
		setInteA.add(4);
		
		setInteB= new HashSet<Integer>();
		setInteB.add(1);
		setInteB.add(2);
		setInteB.add(7);
		setInteB.add(8);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		setStrA = null;
		setStrB = null;
		setInteA = null;
		setInteB = null;
	}

	@Test
	void testUnionInteger() {
		Set<Integer> totalUnion = new HashSet<Integer>();
		totalUnion.add(1);
		totalUnion.add(2);
		totalUnion.add(3);
		totalUnion.add(4);
		totalUnion.add(7);
		totalUnion.add(8);
		//union de los dos sin tener en cuenta los duplicados
		
		assertEquals(totalUnion, SetOperations.union(setInteA, setInteB));
	}

}
