package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int traineeId;
	private String traineeName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	  private List<Trainee> trainees;

	public Trainee(int traineeId, String traineeName) {

		this.traineeId = traineeId;
		this.traineeName = traineeName;

	}

	public Trainee() {

	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}
