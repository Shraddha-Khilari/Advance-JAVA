package com.sunbeam.pojos;

import java.sql.Date;

/**
 * Advanced Java @ DMC Sep 2023
 * Trainer: Nilesh Ghule
 * Time: 2023-11-28 18:19 
 */
public class Movie {
	private int id;
	private String title;
	private Date release;
	
	public Movie() {
	}

	public Movie(int id, String title, Date release) {
		this.id = id;
		this.title = title;
		this.release = release;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRelease() {
		return release;
	}

	public void setRelease(Date release) {
		this.release = release;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", release=" + release + "]";
	}
}
