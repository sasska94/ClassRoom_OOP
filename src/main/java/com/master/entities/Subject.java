package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subject database table.
 * 
 */
@Entity
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="description")
	private String description;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idsubject")
	private int idsubject;

	@Column(name="ispublic")
	private boolean ispublic;

	@Column(name="subjectname")
	private String subjectname;

    public Subject() {
    }

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdsubject() {
		return this.idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public boolean getIspublic() {
		return this.ispublic;
	}

	public void setIspublic(boolean ispublic) {
		this.ispublic = ispublic;
	}

	public String getSubjectname() {
		return this.subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

}