package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the picture database table.
 * 
 */
@Entity
public class Picture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="createdat")
	private Timestamp createdat;

	@Column(name="description")
	private String description;

	@Column(name="enabled")
	private String enabled;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idpicture")
	private String idpicture;

	@Column(name="idprofessoor")
	private int idprofessoor;

	@Column(name="idstudent")
	private int idstudent;

	@Column(name="name")
	private String name;

	@Column(name="updatedat")
	private String updatedat;

    public Picture() {
    }

	public Timestamp getCreatedat() {
		return this.createdat;
	}

	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getIdpicture() {
		return this.idpicture;
	}

	public void setIdpicture(String idpicture) {
		this.idpicture = idpicture;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpdatedat() {
		return this.updatedat;
	}

	public void setUpdatedat(String updatedat) {
		this.updatedat = updatedat;
	}

}