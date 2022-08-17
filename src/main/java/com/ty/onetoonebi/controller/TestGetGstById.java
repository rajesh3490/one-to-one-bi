package com.ty.onetoonebi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.Company;
import com.ty.onetoonebi.dto.Gst;

public class TestGetGstById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Gst gst = entityManager.find(Gst.class, 1);

		Company company = gst.getCompany();

		System.out.println("company's gst id is  " + gst.getId());
		System.out.println("company's gst number is  " + gst.getGstNumber());
		System.out.println("company's gst  status is  " + gst.getStatus());

		if (company != null) {
			System.out.println("company id is " + company.getId());
			System.out.println("company name is " + company.getName());
			System.out.println("company phone is  " + company.getPhone());

		}
	}

}
