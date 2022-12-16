package com.baeldung.boot.jsp.repository.impl;

import java.util.Collection;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.JpaFullRepository;
import com.baeldung.boot.jsp.repository.model.BookData;



@Component //Para decirle que es un componente de Srping ponemos @Component
public class DbJPABookRepository implements BookRepository {
	@Autowired
	private JpaFullRepository jpaFr; //Definimos un atributo

	@Override
	public Collection<BookData> findAll() {
		
		return jpaFr.findAll();//Usamos el atributo
	}

	@Override
	public Optional<BookData> findById(String isbn) {
		// TODO Auto-generated method stub
		return jpaFr.findById(isbn);
	}

	@Override
	public BookData add(BookData book) {
		// TODO Auto-generated method stub
		return jpaFr.save(book);
	}

}
