package com.ty.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Bus;
import com.ty.onetomany.dto.Organisation;

public class TestSaveBuses {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Bus> buses = new ArrayList<>();

		Bus bus1 = new Bus();
		bus1.setType("Ac Sleeper");
		bus1.setCapacity(30);

		Bus bus2 = new Bus();
		bus2.setType("Non Ac semi Sleeper");
		bus2.setCapacity(30);

		Bus bus3 = new Bus();
		bus3.setType("Ac Semi Sleeper");
		bus3.setCapacity(30);

		buses.add(bus1);
		buses.add(bus2);
		buses.add(bus3);

		Organisation organisation = new Organisation();
		organisation.setName("SETC");
		organisation.setAddress("Chennai");
		organisation.setBuses(buses);

		entityTransaction.begin();

		entityManager.persist(organisation);
		entityManager.persist(bus1);
		entityManager.persist(bus2);
		entityManager.persist(bus3);

		entityTransaction.commit();
		System.out.println("--------Data stored-----------");
	}

}
