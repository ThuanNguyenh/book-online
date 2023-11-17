package com.example.mywebapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "symptom")
	private String symptom;

	@Column(name = "medicalID")
	private int medicalID;

	public Patient() {
		
	}

	public Patient(String fullName, String symptom, int medicalID) {
		this.fullName = fullName;
		this.symptom = symptom;
		this.medicalID = medicalID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public int getMedicalID() {
		return medicalID;
	}

	public void setMedicalID(int medicalID) {
		this.medicalID = medicalID;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", fullName=" + fullName + ", symptom=" + symptom + ", medicalID=" + medicalID
				+ "]";
	}

}
