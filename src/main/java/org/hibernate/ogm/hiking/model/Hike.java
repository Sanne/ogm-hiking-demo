package org.hibernate.ogm.hiking.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;

public class Hike {

	public long id;

	public String start;
	
	public String destination;
	
	public Person organizer;

	Hike() {
	}

	public Hike(String start, String destination) {
		this.start = start;
		this.destination = destination;
	}
}
