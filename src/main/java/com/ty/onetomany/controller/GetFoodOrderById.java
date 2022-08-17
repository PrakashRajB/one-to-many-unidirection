package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.FoodOrder;
import com.ty.onetomany.dto.Item;

public class GetFoodOrderById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		FoodOrder order = entityManager.find(FoodOrder.class, 1);
		System.out.println("FoodOrder Id is " + order.getId());
		System.out.println("Food Ordered Address is " + order.getAddress());
		System.out.println("Customer Name is " + order.getCustomerName());
		System.out.println("Phone Number is " + order.getPhone());

		List<Item> items = order.getItems();
		for (Item i : items) {
			System.out.println("Item id - " + i.getId());
			System.out.println("Item Name - " + i.getName());
			System.out.println("Item quantity - " + i.getQuantity());
			System.out.println("Item cost - " + i.getCost());
			System.out.println("---------------------------------------");
		}
	}
}
