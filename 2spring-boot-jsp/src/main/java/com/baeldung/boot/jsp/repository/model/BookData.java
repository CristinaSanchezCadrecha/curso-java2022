package com.baeldung.boot.jsp.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="books")
public class BookData {
	
	@Id
    @Column(name= "bk_isbn")
	private String isbn;
	
	@Column(name= "bk_name")
	private String name;
	
	@Column(name= "bk_author")
	private String author;

    
    
    
    
    
    
    
//	public BookData() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public BookData(String isbn, String name, String author) {
//		super();
//		this.isbn = isbn;
//		this.name = name;
//		this.author = author;
//	}
//	public String getIsbn() {
//		return isbn;
//	}
//	public void setIsbn(String isbn) {
//		this.isbn = isbn;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
    
}