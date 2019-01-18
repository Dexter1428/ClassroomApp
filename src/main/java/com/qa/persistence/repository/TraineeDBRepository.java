package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

public class TraineeDBRepository implements TraineeRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM Trainee a");
		@SuppressWarnings("unchecked")
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainees);
	}
	
	@Transactional(REQUIRED)
	public String addTrainee(String trainee) {
		Trainee newTrainee = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(newTrainee);
		return "{\"message\": \"Trainee added\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteTrainee(int id) {
		Trainee toDelete = findTrainee(id);
		if(toDelete != null) {
			manager.remove(toDelete);
			return "{\"message\": \"Trainee deleted\"}";
		}

		return "{\"message\": \"Trainee not found\"}";
	}
	
	@Transactional(REQUIRED)
	public Trainee findTrainee(int id) {
		return manager.find(Trainee.class, id);
	}
	
	@Transactional(REQUIRED)
	public String updateTrainee(int id, String trainee) {
		Trainee theTrainee = findTrainee(id);
		if(theTrainee != null) {
			manager.remove(theTrainee);
			Trainee aTrainee = util.getObjectForJSON(trainee, Trainee.class);
			manager.persist(aTrainee);
			return "{\"message\": \"Account updated\"}";
		}
		return "{\"message\": \"Account not found\"}";
	}
	
	

}
