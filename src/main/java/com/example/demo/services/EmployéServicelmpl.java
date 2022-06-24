package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employe;

import com.example.demo.repository.EmployéRepository;

@Service
public class EmployéServicelmpl implements EmployéServices  {

	@Autowired
	private EmployéRepository employéRepository;
	
	@Override
	public List<Employe> getAllEmployé() {
		return employéRepository.findAll();
	}

	@Override
	public void saveEmployee(Employe employee) {
		// TODO Auto-generated method stub
		this.employéRepository.save(employee);
	}

	@Override
	public Employe getEmployeeById(long id) {
		Optional <Employe> optional = employéRepository.findById(id);
		Employe employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id :: " + id);
		}
		return employee;
	}

}
