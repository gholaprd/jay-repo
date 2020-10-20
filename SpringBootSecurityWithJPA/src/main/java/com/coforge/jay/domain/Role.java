package com.coforge.jay.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {
	
	@Id
	@GeneratedValue
	@Column(name = "ROLE_ID")
	private Integer roleID;
	@Column(name = "ROLE")
	private String role;
	/**
	 * 
	 */
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param roleID
	 * @param role
	 */
	public Role(Integer roleID, String role) {
		this();
		this.roleID = roleID;
		this.role = role;
	}

	/**
	 * @return the roleID
	 */
	public Integer getRoleID() {
		return roleID;
	}
	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
}
