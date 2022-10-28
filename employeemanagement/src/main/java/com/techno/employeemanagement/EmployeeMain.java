package com.techno.employeemanagement;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {
	public static void main(String[] args) {

		EmployeePrimaryInfo employeePrimaryInfo = new EmployeePrimaryInfo();
		employeePrimaryInfo.setEmpId(1);
		employeePrimaryInfo.setEmpName("kiran");
		employeePrimaryInfo.setEmpAge(20);
		employeePrimaryInfo.setEmpDesignation("software dev");
		employeePrimaryInfo.setEmpBloodGroup("B+ve");
		employeePrimaryInfo.setEmpEmailId("kiran@gmail.com");
		employeePrimaryInfo.setEmpDOB("10 sept 1996");
		employeePrimaryInfo.setEmpMaritalStatus("unmarried");
		employeePrimaryInfo.setEmpGender("female");
		employeePrimaryInfo.setEmpDeptNo(10);

		EmployeeAddressInfo addressInfo = new EmployeeAddressInfo();
		addressInfo.setEmpAddressType("Permanent");
		addressInfo.setEmpHno("H.No.296");
		addressInfo.setEmpStreetName("swami vivekanand street");
		addressInfo.setEmpLocalityName("Bhagur");
		addressInfo.setEmpDistrictName("Nashik");
		addressInfo.setEmpStateName("Maharashtra");
		addressInfo.setEmpPincode(422401);
		addressInfo.setEmpCountry("India");
		addressInfo.setEmployeePrimaryInfo(employeePrimaryInfo);

		EmployeeAddressInfo addressInfo2 = new EmployeeAddressInfo();
		addressInfo2.setEmpAddressType("Temporary");
		addressInfo2.setEmpHno("H.No.200");
		addressInfo2.setEmpStreetName("new street");
		addressInfo2.setEmpLocalityName("jayanagar");
		addressInfo2.setEmpDistrictName("Bangalore");
		addressInfo2.setEmpStateName("Karnataka");
		addressInfo2.setEmpPincode(560006);
		addressInfo2.setEmpCountry("India");
		addressInfo2.setEmployeePrimaryInfo(employeePrimaryInfo);
		
		ArrayList<EmployeeAddressInfo> arrayAddressInfo=new ArrayList<EmployeeAddressInfo>();
		arrayAddressInfo.add(addressInfo);
		arrayAddressInfo.add(addressInfo2);
		employeePrimaryInfo.setAddressInfo(arrayAddressInfo);
		
		EmployeeEducationalInfo educationalInfo=new EmployeeEducationalInfo();
		educationalInfo.setQualificationType("SSC");
		educationalInfo.setUniversity("K.V.No.1 Nashik");
		educationalInfo.setPercentage(70);
		educationalInfo.setYearOfPassing(2012);
		educationalInfo.setEmployeePrimaryInfo(employeePrimaryInfo);
		
		EmployeeEducationalInfo educationalInfo1=new EmployeeEducationalInfo();
		educationalInfo1.setQualificationType("HSC");
		educationalInfo1.setUniversity("K.V.No.1 Nashik");
		educationalInfo1.setPercentage(60);
		educationalInfo1.setYearOfPassing(2014);
		educationalInfo1.setEmployeePrimaryInfo(employeePrimaryInfo);
		
		EmployeeEducationalInfo educationalInfo2=new EmployeeEducationalInfo();
		educationalInfo2.setQualificationType("Diploma");
		educationalInfo2.setUniversity("S.K.B.P Kopargaon");
		educationalInfo2.setPercentage(76);
		educationalInfo2.setYearOfPassing(2017);
		educationalInfo2.setEmployeePrimaryInfo(employeePrimaryInfo);
		
		ArrayList<EmployeeEducationalInfo> arrayEducationalInfos =new ArrayList<EmployeeEducationalInfo>();
		arrayEducationalInfos.add(educationalInfo);
		arrayEducationalInfos.add(educationalInfo1);
		arrayEducationalInfos.add(educationalInfo2);
		employeePrimaryInfo.setEducationalInfo(arrayEducationalInfos);
		
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employee");
		try {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(employeePrimaryInfo);
			entityTransaction.commit();
		} catch (Exception e) {
			if (entityTransaction!=null) {
				entityTransaction.rollback();
			}
		}
		finally {
			if (entityManager!=null) {
				entityManager.close();
			}
		}
	}
}
