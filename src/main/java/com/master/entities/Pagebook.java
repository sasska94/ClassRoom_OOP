package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pagebook database table.
 * 
 */
@Entity
public class Pagebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="idbook")
	private int idbook;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idpageb")
	private int idpageb;

	@Column(name="number")
	private int number;

	@Column(name="textpageb")
	private String textpageb;

    public Pagebook() {
    }

	public int getIdbook() {
		return this.idbook;
	}

	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}

	public int getIdpageb() {
		return this.idpageb;
	}

	public void setIdpageb(int idpageb) {
		this.idpageb = idpageb;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTextpageb() {
		return this.textpageb;
	}

	public void setTextpageb(String textpageb) {
		this.textpageb = textpageb;
	}

}