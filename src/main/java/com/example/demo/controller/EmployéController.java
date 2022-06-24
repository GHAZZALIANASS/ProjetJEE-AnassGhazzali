package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.EmployéServices;
import com.example.demo.model.Employe;

@Controller
public class EmployéController {
	
	@Autowired
	private EmployéServices	employeService;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listeEmploye",employeService.getAllEmployé() );
		return "index";
	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employe employee = new Employe();
		model.addAttribute("employee", employee);
		return "newEmployee";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employe employee) {
		employeService.saveEmployee(employee);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormUpdate(@PathVariable ( value = "id")long id, Model model) {
		Employe employee = employeService.getEmployeeById(id);
		
		model.addAttribute("employee", employee);
		return "update_employee";
		
	} 
}
