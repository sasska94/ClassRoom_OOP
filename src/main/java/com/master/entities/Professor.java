package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the professor database table.
 * 
 */
@Entity
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="address")
	private String address;

	@Column(name="faculty")
	private String faculty;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idprofessoor")
	private int idprofessoor;

	@Column(name="name")
	private String name;

	@Column(name="professortitle")
	private String professortitle;

	@Column(name="surname")
	private String surname;

    public Professor() {
    }

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getIdprofessoor() {
		return this.idprofessoor;
	}

	public void setIdprofessoor(int idprofessoor) {
		this.idprofessoor = idprofessoor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfessortitle() {
		return this.professortitle;
	}

	public void setProfessortitle(String professortitle) {
		this.professortitle = professortitle;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}