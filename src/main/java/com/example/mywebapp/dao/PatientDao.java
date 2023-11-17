package com.example.mywebapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.mywebapp.entity.Patient;
//import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientDao {

	@Autowired
	SessionFactory sessionFactory;

	public PatientDao() {

	}

	// list patients
	@Transactional
	public List<Patient> getAllPatients() {
		Session session = sessionFactory.openSession();
		List result = session.createQuery("from Patient").getResultList();

		return result;

	}

	// add patients
	@Transactional
	public void addPatients(Patient patient) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(patient);
		session.getTransaction().commit();
	}

	// edit patients
	@Transactional
	public void updatePatients(Patient patient) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(patient);
		session.getTransaction().commit();
	}

	// get patient by id
	@Transactional
	public Patient getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Patient pt = session.get(Patient.class, id);
		session.getTransaction().commit();
		return pt;
	}

	// delete patients
	@Transactional
	public void deletePatients(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		var pt = session.get(Patient.class, id);
		session.remove(pt);
		session.getTransaction().commit();
	}

}
