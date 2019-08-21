package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the notebook database table.
 * 
 */
@Entity
public class Notebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="description")
	private String description;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idnotebook")
	private int idnotebook;

	@Column(name="idstudent")
	private int idstudent;

	@Column(name="name")
	private String name;

    public Notebook() {
    }

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdnotebook() {
		return this.idnotebook;
	}

	public void setIdnotebook(int idnotebook) {
		this.idnotebook = idnotebook;
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

}