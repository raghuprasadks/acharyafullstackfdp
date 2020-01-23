package com.kaushalya.todo.todorestapp;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Todo {
	int id;
	String name;
	Date datePlanned;
	String status;
	public Todo()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDatePlanned() {
		return datePlanned;
	}
	public void setDatePlanned(Date datePlanned) {
		this.datePlanned = datePlanned;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
