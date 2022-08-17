package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Company;
import com.ty.onetoonebi.dto.Gst;

public class TestSaveCompany {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("testyantra");
		company.setPhone(1234567789);

		Gst gst = new Gst();
		gst.setCompany(company);
		gst.setGstNumber("CETKP34O");
		gst.setStatus("active");

		entityTransaction.begin();
		entityManager.persist(gst);
		entityTransaction.commit();
		System.out.println("data is stored");
	}

}
