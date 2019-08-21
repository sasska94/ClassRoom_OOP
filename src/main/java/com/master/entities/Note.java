package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the note database table.
 * 
 */
@Entity
public class Note implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idnote")
	private int idnote;

	@Column(name="idnotes")
	private int idnotes;

	@Column(name="text")
	private String text;

    public Note() {
    }

	public int getIdnote() {
		return this.idnote;
	}

	public void setIdnote(int idnote) {
		this.idnote = idnote;
	}

	public int getIdnotes() {
		return this.idnotes;
	}

	public void setIdnotes(int idnotes) {
		this.idnotes = idnotes;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}