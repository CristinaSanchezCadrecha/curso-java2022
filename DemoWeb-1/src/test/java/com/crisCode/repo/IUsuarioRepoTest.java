package com.crisCode.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crisCode.model.Usuario;

@SpringBootTest
class IUsuarioRepoTest {
	
	@Autowired
	private IUsuarioRepo usuRepo;

	
	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0, "Cristina", "criscode");
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals("criscode", usuRetorno.getClave());
	}

}
