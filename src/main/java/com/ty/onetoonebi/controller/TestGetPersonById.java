package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Pan;
import com.ty.onetoonebi.dto.Person;

public class TestGetPersonById {

	public static void main(String[] args) throws InterruptedException {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);

		System.out.println("person id is " + person.getId());
		System.out.println("person name is " + person.getName());
		System.out.println("person age is " + person.getAge());

		Thread.sleep(2000);
		Pan pan = person.getPan();

		if (pan != null) {

			System.out.println("pan id is " + pan.getId());
			System.out.println("pan number is " + pan.getPanNumber());
			System.out.println("person's fatherName is " + pan.getFatherName());
		}

	}

}
