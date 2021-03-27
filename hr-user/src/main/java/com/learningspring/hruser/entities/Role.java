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
