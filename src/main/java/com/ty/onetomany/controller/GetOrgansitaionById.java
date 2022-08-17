package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Bus;
import com.ty.onetomany.dto.Organisation;

public class GetOrgansitaionById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Organisation organisation = entityManager.find(Organisation.class, 3);

		System.out.println("Organisation Id is " + organisation.getId());
		System.out.println("Oraganisation Name is " + organisation.getName());
		System.out.println("Organisation Address is " + organisation.getAddress());

		List<Bus> buses = organisation.getBuses();
		for (Bus bus : buses) {
			System.out.println("Bus Id - " + bus.getId());
			System.out.println("Bus Type - " + bus.getType());
			System.out.println("Bus Capacity - " + bus.getCapacity());
			System.out.println("----------------------------------------");
		}
	}

}
