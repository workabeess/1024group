package com.entiy;

import java.sql.Timestamp;

/**
 * Mood entity. @author MyEclipse Persistence Tools
 */

public class Mood implements java.io.Serializable {

	// Fields

	private Integer moodid;
	private User user;
	private Timestamp moodTime;
	private String moodcol;

	// Constructors

	/** default constructor */
	public Mood() {
	}

	/** full constructor */
	public Mood(Integer moodid, User user, Timestamp moodTime, String moodcol) {
		this.moodid = moodid;
		this.user = user;
		this.moodTime = moodTime;
		this.moodcol = moodcol;
	}

	// Property accessors

	public Integer getMoodid() {
		return this.moodid;
	}

	public void setMoodid(Integer moodid) {
		this.moodid = moodid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getMoodTime() {
		return this.moodTime;
	}

	public void setMoodTime(Timestamp moodTime) {
		this.moodTime = moodTime;
	}

	public String getMoodcol() {
		return this.moodcol;
	}

	public void setMoodcol(String moodcol) {
		this.moodcol = moodcol;
	}

}