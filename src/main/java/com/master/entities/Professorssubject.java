package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the professorssubjects database table.
 * 
 */
@Entity
@Table(name="professorssubjects")
public class Professorssubject implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idprofessoor;

	private int idsubject;

    public Professorssubject() {
    }

	public int getIdprofessoor() {
		return this.idprofessoor;
	}

	public void setIdprofessoor(int idprofessoor) {
		this.idprofessoor = idprofessoor;
	}

	public int getIdsubject() {
		return this.idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

}