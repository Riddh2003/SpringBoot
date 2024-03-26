package com.riddh.springboot.demo.myapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Alien {
	@Id
	private int id;
	private String name;
	private String points;

	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alien{" +
				"id=" + id +
				", name='" + name + '\'' +
				", points='" + points + '\'' +
				'}';
	}
}
