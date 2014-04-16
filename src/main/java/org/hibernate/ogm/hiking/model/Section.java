package org.hibernate.ogm.hiking.model;

import javax.persistence.Embeddable;

public class Section {

	public String from;
	public String to;

	Section() {
	}

	public Section(String from, String to) {
		this.from = from;
		this.to = to;
	}

}
