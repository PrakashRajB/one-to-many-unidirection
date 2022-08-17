package com.ty.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.FoodOrder;
import com.ty.onetomany.dto.Item;

public class SaveFoodOrder {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Item> items = new ArrayList<>();

		Item item1 = new Item();
		item1.setName("Chicken Volcano");
		item1.setQuantity(2);
		item1.setCost(330);

		Item item2 = new Item();
		item2.setName("cheese Dosa");
		item2.setQuantity(1);
		item2.setCost(120);

		items.add(item1);
		items.add(item2);

		FoodOrder order = new FoodOrder();
		order.setCustomerName("Sham");
		order.setAddress("Madiwala");
		order.setPhone(9080919279l);
		order.setItems(items);

		entityTransaction.begin();
		entityManager.persist(order);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();
		System.out.println("------data Stored-----");
	}
}
