package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Trainee;
import com.qa.persistence.repository.TraineeRepository;
import com.qa.util.JSONUtil;

public class TraineeServiceImpl implements TraineeService {

	@Inject
	private TraineeRepository repo;

	@Inject
	private JSONUtil util;

	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String addTrainee(String trainee) {
		return repo.addTrainee(trainee);
	}

	public String deleteTrainee(int id) {
		return repo.deleteTrainee(id);
	}

	public Trainee findTrainee(int id) {
		return repo.findTrainee(id);
	}

	public String updateTrainee(int id, String trainee) {

		return repo.updateTrainee(id, trainee);

	}

	public JSONUtil getUtil() {
		return util;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
