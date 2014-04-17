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
import javax.validation.constraints.NotNull;

@Entity
public class Hike {

	@Id @GeneratedValue
	public long id;

	@NotNull
	public String start;
	
	@NotNull
	public String destination;
	
	@ManyToOne
	public Person organizer;

	@ElementCollection
	public List<Section> sections = new ArrayList<>();

	Hike() {
	}

	public Hike(String start, String destination) {
		this.start = start;
		this.destination = destination;
	}
}
