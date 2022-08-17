package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Pan;
import com.ty.onetoonebi.dto.Person;

public class TestSavePerson {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("rajesh");
		person.setAge(25);

		Pan pan = new Pan();
		pan.setFatherName("purushotham reddy");
		pan.setPanNumber("CTKPR3OONK");
		pan.setPerson(person);

		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();

		System.out.println("data stored");
	}

}
