package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.TraineeService;
import com.qa.persistence.domain.Trainee;


@Path("/trainee")
public class TraineeEndpoint {
	
	@Inject TraineeService service;
	
	@Path("/getAllTrainees")
	@GET
	@Produces({"application/json"})
	public String getAllTrainees() {
		return service.getAllTrainees();
	}
	
	@Path("/addTrainee")
	@POST
	@Produces({"application/json"})
	public String addTrainee(String trainee) {
		return service.addTrainee(trainee);
	}
	
	//
	//
	//
	
	@Path("findTrainee/{id}")
	@GET
	@Produces({"application/json"})
	public Trainee findTrainee(@PathParam("id") int id) {
		return service.findTrainee(id);
	}
	
	@Path("updateTrainee/{id}")
	@PUT
	@Produces({"application/json"})
	public String updateTrainee(@PathParam("id") int id, String trainee) {
		return service.updateTrainee(id, trainee);
	}

}