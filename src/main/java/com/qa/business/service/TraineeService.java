package com.qa.business.service;

import com.qa.persistence.domain.Trainee;

public interface TraineeService {
	
	String getAllTrainees();
	String addTrainee(String trainee);
	String deleteTrainee(int id);
	Trainee findTrainee(int id);
	String updateTrainee(int id, String trainee);

}
