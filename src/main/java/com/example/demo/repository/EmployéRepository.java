package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employe;

@Repository
public interface EmployéRepository extends JpaRepository<Employe,Long> {

	List<Employe> findAll();

}
