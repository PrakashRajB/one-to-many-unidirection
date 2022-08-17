package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Mobile;
import com.ty.onetomany.dto.Sim;

public class GetMobileById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 2);

		List<Sim> sims = mobile.getSims();

		System.out.println("Mobile Id is " + mobile.getId());
		System.out.println("Mobile Name is " + mobile.getName());
		System.out.println("Mobile Cost is " + mobile.getCost());
		System.out.println("--------------------------------------");

		for (Sim s : sims) {
			System.out.println("Sim id is " + s.getId());
			System.out.println("Sim provider is " + s.getProvider());
			System.out.println("Sim imrc is " + s.getImrc());
			System.out.println("-------------------------------------");
		}
	}
}
