package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pagenotebook database table.
 * 
 */
@Entity
public class Pagenotebook implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idpagen")
	private int idpagen;

	@Column(name="number")
	private int number;

	@Column(name="textpagen")
	private String textpagen;

    public Pagenotebook() {
    }

	public int getIdpagen() {
		return this.idpagen;
	}

	public void setIdpagen(int idpagen) {
		this.idpagen = idpagen;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTextpagen() {
		return this.textpagen;
	}

	public void setTextpagen(String textpagen) {
		this.textpagen = textpagen;
	}

}