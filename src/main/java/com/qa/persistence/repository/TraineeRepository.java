package com.qa.persistence.repository;

import com.qa.persistence.domain.Trainee;

public interface TraineeRepository {
	
	String getAllTrainees();
	String addTrainee(String trainee);
	String deleteTrainee(int id);
	Trainee findTrainee(int id);
	String updateTrainee(int id, String trainee);

}
