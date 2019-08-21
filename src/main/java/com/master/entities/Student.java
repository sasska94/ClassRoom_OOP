package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="address")
	private String address;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idstudent")
	private int idstudent;

	@Column(name="jmbg")
	private String jmbg;

	@Column(name="name")
	private String name;

	@Column(name="phonenumber")
	private String phonenumber;

	@Column(name="surname")
	private String surname;

    public Student() {
    }

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIdstudent() {
		return this.idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}