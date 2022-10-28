package com.techno.springmvcemployeemanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.techno.springmvcemployeemanagement.entity.EmployeePrimaryInfo;

@Repository
public class EmployeeDaoImplimentation implements EmployeeDao {

	@Override
	public boolean register(EmployeePrimaryInfo employeePrimaryInfo) {
		boolean isRegistered = false;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employeePrimaryInfo);
			transaction.commit();
			isRegistered = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isRegistered;
	}

	@Override
	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EmployeePrimaryInfo employee2 = manager.find(EmployeePrimaryInfo.class, employeePrimaryInfo.getEmpId());
		if (employee2 != null) {
			if(employeePrimaryInfo.getEmpPassword().equals(employee2.getEmpPassword())) {
				return employee2;
			}
		}
		return null;
	}
}
