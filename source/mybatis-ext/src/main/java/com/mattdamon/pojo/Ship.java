package com.mattdamon.pojo;

import java.io.Serializable;
import java.util.List;

public class Ship implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5006963806373312346L;
	private int id;
	private String groupname;

	private List<User> userList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
