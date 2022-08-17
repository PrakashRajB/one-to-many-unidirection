package com.ty.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Transaction1;

public class SaveCustomer {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Transaction1> transactions = new ArrayList<>();

		Transaction1 transaction1 = new Transaction1();
		transaction1.setTnxId(4723382);
		transaction1.setTnxMode("Upi");
		transaction1.setAmount(20000);

	}
}
