package com.example.demo.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address adress;
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Telephone> telephones;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project",
	joinColumns = @JoinColumn(name = "eid",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name ="pid",referencedColumnName = "id"))
	private List<Project> projects;
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
