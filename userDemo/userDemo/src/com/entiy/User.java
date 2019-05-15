package com.entiy;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String name;
	private String password;
	private String type;
	private Set moods = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer userId, String name, String password, String type) {
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.type = type;
	}

	/** full constructor */
	public User(Integer userId, String name, String password, String type,
			Set moods) {
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.type = type;
		this.moods = moods;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getMoods() {
		return this.moods;
	}

	public void setMoods(Set moods) {
		this.moods = moods;
	}

}