package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int classroomId;
	private String trainer;
	private String trainees;

	

	public Classroom(int classroomId, String trainer, String trainees) {

		this.classroomId = classroomId;
		this.trainer = trainer;
		this.trainees = trainees;

	}
	
	public Classroom() {

	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTrainees() {
		return trainees;
	}

	public void setTrainees(String trainees) {
		this.trainees = trainees;
	}

}
