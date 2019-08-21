package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the studentprofessor database table.
 * 
 */
@Entity
public class Studentprofessor implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idprofessoor;

	private int idstudent;

	private int mark;

	private String notes;

	private int points;

    public Studentprofessor() {
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

	public int getMark() {
		return this.mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}