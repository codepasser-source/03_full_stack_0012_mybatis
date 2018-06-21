package com.mattdamon.pojo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -4524066505362235666L;

	private int id;
	private String username;
	private String password;
	private int shipid;

	public User() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "User [id = " + id + " , username = " + username + "]"
				+ " , password = " + password;
	}

	public int getShipid() {
		return shipid;
	}

	public void setShipid(int shipid) {
		this.shipid = shipid;
	}

}