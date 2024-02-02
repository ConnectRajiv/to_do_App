package com.backend.todolist.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "Title is required")
	private String title;
	
	@NotEmpty(message = "Description is required")
	@Column(name = "description")
	private String Description;

	@NotNull(message = "Target date is required")
	private Date targetDate;
	
	private String username;
	
	private boolean isCompleted;
	
	public Todo(String title, String Description, Date targetDate, String username) {
		super();
		this.title = title;
		this.Description = Description;
		this.targetDate = targetDate;
		this.username = username;
		this.isCompleted = false;
	}
	
	
	public Todo() {
		
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}

	public void setIdd(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String Description) {
		this.Description = Description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", Description=" + Description +  ", targetDate=" + targetDate + ", username=" + username
				+ ", isCompleted=" + isCompleted + "]";
	}
	
}
