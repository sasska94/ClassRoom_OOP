package com.master.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the book database table.
 * 
 */
@Entity
@Table(name="book")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="author")
	private String author;

	@Column(name="description")
	private String description;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idbook")
	private int idbook;

	@Column(name="idprofessoor")
	private int idprofessoor;

	@Column(name="idstudent")
	private int idstudent;

	@Column(name="name")
	private String name;

	@Column(name="publisher")
	private String publisher;

    public Book() {
    }

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdbook() {
		return this.idbook;
	}

	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}

	public int getIdprofessoor() {
		return this.idprofessoor;
	}

	public void setIdprofessoor(int idprofessoor) {
		this.idprofessoor = idprofessoor;
	}

	public int getIdstudent() {
		return this.idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}