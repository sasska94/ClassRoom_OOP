package com.master.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_table database table.
 * 
 */
@Entity
@Table(name="user_table")
public class UserTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="password")
	private String password;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
	private int userid;

	@Column(name="username")
	private String username;

    public UserTable() {
    }

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}