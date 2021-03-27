package com.learningspring.hruser.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "tb_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 5728179900267803417L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	private String rolename;
	
	
	public Role() {		
	
	}

	public Role(Long id, String rolename) {		
		this.id = id;
		this.rolename = rolename;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
		
	
}
