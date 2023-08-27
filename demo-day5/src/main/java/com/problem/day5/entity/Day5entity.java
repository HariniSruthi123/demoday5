package com.problem.day5.entity;





import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table
public class Day5entity {

}

	@Id
	private int id;
	private String name;
	private String stream;
	public Day5entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Day5entity(int id, String name, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	

}