package com.qa.business.service;

public interface ClassroomService {
	
	String getAllTrainees();
	String addTrainee(String trainee);
	String deleteTrainee(int id);
	String updateTrainee(int id, String trainee);

}
