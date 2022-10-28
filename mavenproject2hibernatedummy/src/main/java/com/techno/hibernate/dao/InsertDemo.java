package com.techno.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.techno.mavenproject2hibernatedummy.Employee;

public class InsertDemo {
	public static void main(String[] args) {
		Employee employee = new Employee();
//		employee.setEmpId(1);
		
//		employee.setEmpId(2);
		employee.setEmpName("kiran");
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		

//		entityManager.persist(employee);
		entityTransaction.commit();
		Employee employee2 = entityManager.find(Employee.class,1);
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName());
		
	
		
		
		

	}
}
