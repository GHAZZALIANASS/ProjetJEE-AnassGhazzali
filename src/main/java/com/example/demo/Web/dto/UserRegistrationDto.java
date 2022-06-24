package com.example.demo.Web.dto;

public class UserRegistrationDto {
	private String nom;
	private String Prenom;
	private String email;
	private String password;
	
	public UserRegistrationDto(){}
	public UserRegistrationDto(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		Prenom = prenom;
		this.email = email;
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
