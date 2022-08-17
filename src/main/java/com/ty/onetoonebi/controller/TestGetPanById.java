package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Pan;
import com.ty.onetoonebi.dto.Person;

public class TestGetPanById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);

		Person person = pan.getPerson();

		System.out.println("pan id is " + pan.getId());
		System.out.println("pan number is " + pan.getPanNumber());
		System.out.println("person's fatherName is " + pan.getFatherName());

		if (person != null) {

			System.out.println("pan id is " + person.getId());
			System.out.println("person name is " + person.getName());
			System.out.println("person age is " + person.getAge());
		}

	}

}
