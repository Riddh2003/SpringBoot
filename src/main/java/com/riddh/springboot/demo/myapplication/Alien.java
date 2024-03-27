package com.riddh.springboot.demo.myapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private int points;
	public int getId() {
		return aid;
	}
	public void setId(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return aname;
	}
	public void setName(String aname) {
		this.aname = aname;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Alien{" +
				"id=" + aid +
				", name='" + aname + '\'' +
				", points='" + points + '\'' +
				'}';
	}
}
