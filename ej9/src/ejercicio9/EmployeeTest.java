package ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest extends Employee {
	
	Employee patricia;
	Employee cristina;

	@BeforeEach
	void setUp() throws Exception {
		Date fechaIngreso = new Date(2022, 11, 25);

		cristina = new Employee(fechaIngreso, 16000, "Cris", 37);
		patricia = new Employee();
	}

	@AfterEach
	void tearDown() throws Exception {
		cristina = null;
		patricia = null;
	}

	@Test
	void testCristinaEquals_true() {
		Date fechaIngreso = new Date(2022, 11, 25);
		
		
		Employee cristinaTest = new Employee(fechaIngreso, 16000, "Cris", 37);		
		assertTrue(cristina.equals(cristinaTest));
		
	}
	
	

}












