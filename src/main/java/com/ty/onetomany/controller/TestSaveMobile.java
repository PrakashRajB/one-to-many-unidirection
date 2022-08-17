package com.ty.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Mobile;
import com.ty.onetomany.dto.Sim;

public class TestSaveMobile {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Sim> sims = new ArrayList<>();

		Sim sim1 = new Sim();
		sim1.setProvider("Aircel");
		sim1.setImrc(4349349338l);

		Sim sim2 = new Sim();
		sim2.setProvider("BSNL");
		sim2.setImrc(982934824l);

		sims.add(sim1);
		sims.add(sim2);

		Mobile mobile = new Mobile();
		mobile.setName("OPPO");
		mobile.setCost(29000);

		mobile.setSims(sims);

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();

		System.out.println("-----data stored-----");
	}
}
