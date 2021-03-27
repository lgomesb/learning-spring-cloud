package com.learningspring.hroauth.entities;

import java.io.Serializable;

public class Role implements Serializable {

	private static final long serialVersionUID = 5728179900267803417L;

	private Long id;
	private String roleName;
	
	public Role() {		
	
	}

	public Role(Long id, String roleName) {		
		this.id = id;
		this.roleName = roleName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String rolename) {
		this.roleName = rolename;
	}
		
	
}
