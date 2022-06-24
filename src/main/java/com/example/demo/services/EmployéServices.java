package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employe;


public interface EmployéServices {
	List<Employe> getAllEmployé();
	void saveEmployee(Employe employe);
	Employe getEmployeeById(long id);
}
