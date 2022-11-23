package com.softtek.app1.hibernate1;

import javax.persistence.Embeddable;

@Embeddable
public class certificate {
	private String course;
	private String duration;

	
	
	public certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	

	public certificate() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "certificate [course=" + course + ", duration=" + duration + "]";
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
