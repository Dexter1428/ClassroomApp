package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int classroomId;
	private String trainer;
	//private String trainees;
	
	@OneToMany(mappedBy="classroom")
    private Collection<Trainee> trainees;
	
		public Classroom(int classroomId, String trainer, ArrayList<Trainee> trainees) {
			
			trainees = new ArrayList<Trainee>();

		this.classroomId = classroomId;
		this.trainer = trainer;
		//this.trainees = trainees;

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
	
	public Collection<Trainee> getTrainees() {
        return trainees;
    }

//	public String getTrainees() {
//		return trainees;
//	}
//
//	public void setTrainees(String trainees) {
//		this.trainees = trainees;
//	}

}
