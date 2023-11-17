package com.example.mywebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mywebapp.dao.PatientDao;
import com.example.mywebapp.entity.Patient;

@Controller
@RequestMapping("/patients")
public class patientController {

	@Autowired
	private PatientDao patientDao = new PatientDao();

//	public patientController(PatientDao patientDao) {
//		this.patientDao = patientDao;
//	}

	@GetMapping("list")
	public String ListPatients(Model model) {

		List<Patient> thePatients = patientDao.getAllPatients();
		model.addAttribute("patients", thePatients);

		return "listPatient";
	}

	@GetMapping("addPatient")
	public String addPatientView(Model model) {
		var patient = new Patient();
		model.addAttribute("patient", patient);
		return "addPatient";
	}

	// add patient
	@PostMapping("/addPatientPost")
	public String savePatient(@ModelAttribute("patient") Patient patient, Model model) {
		try {

			patientDao.addPatients(patient);

		} catch (Exception ex) {

			model.addAttribute("error", ex.getMessage());

			model.addAttribute("patient", patient);

			return "redirect:/patients/list";

		}

		return "redirect:/patients/list";

	}

	@GetMapping("edit")
//	public String edit() {
//		return "update";
//	}

	public String edit(@RequestParam("id") int id, Model model) {

		var patient = patientDao.getById(id);
		
		try {
			model.addAttribute("patient", patient);
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("patient", patient);
			return "update";
			
		}

		

		return "update";

	}

	@PostMapping("update")

	public String update(@ModelAttribute("patient") Patient patient, Model model) {

		try {

			patientDao.updatePatients(patient);

		} catch (Exception ex) {

			model.addAttribute("error", ex.getMessage());

			model.addAttribute("patient", patient);

			return "update";

		}

		return "redirect:/patients/list";

	}

	// remove patient
	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		try {
			patientDao.deletePatients(id);
		} catch (Exception e) {
			// TODO: handle exception
			return "redirect:/patients/list";
		}

		return "redirect:/patients/list";
	}

	@GetMapping("error")
	public String handleError() {
		// Xử lý lỗi và chuyển hướng đến một trang lỗi cụ thể
		return "errorPage";
	}

}
