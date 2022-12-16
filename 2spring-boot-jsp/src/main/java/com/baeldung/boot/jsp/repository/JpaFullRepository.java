package com.baeldung.boot.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.boot.jsp.repository.model.BookData;

/**
 * @author mariacsa
 * Esta interface por si sola resuelve todos los metodos conocidos
	lo importante es completar las clases con el table,column, id

 */
public interface JpaFullRepository extends JpaRepository<BookData, String> { //String por el tipo de dato

}
