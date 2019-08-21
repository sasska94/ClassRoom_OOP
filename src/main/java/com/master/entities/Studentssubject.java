package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the studentssubject database table.
 * 
 */
@Entity
public class Studentssubject implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idstudent;

	private int idsubject;

    public Studentssubject() {
    }

	public int getIdstudent() {
		return this.idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public int getIdsubject() {
		return this.idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

}