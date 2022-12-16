package com.baeldung.boot.jsp.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.boot.jsp.repository.BookRepository;


@SpringBootTest
class DbJPABookRepositoryTest {
	
	@Autowired
	BookRepository bookrepo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAll() {
		System.out.println("Todos " + bookrepo.findAll());
		assertEquals(4, bookrepo.findAll().size());
	}
	
	@Test
	void testFindById() {
		assertEquals("Mataime", bookrepo.findById("123456799").get().getName());
	}
	

}
