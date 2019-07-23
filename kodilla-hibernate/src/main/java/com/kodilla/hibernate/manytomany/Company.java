package com.kodilla.hibernate.manytomany;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
	name = "Company.retrieveCompanyName",
	query = "SELECT * FROM Company" +
		" WHERE name LIKE :STRING% "
)
@Entity
@Table(name = "COMPANIES")
public class Company {
	private int id;
	private String name;
	private List<Employee> employees = new ArrayList<>();

	public Company() {
	}

	public Company(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	@Column(name = "COMPANY_ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	@Column(name = "COMPANY_NAME", nullable = false)
	public String getName() {
		return name;
	}

	private void setId(int id) {
		this.id = id;
	}

	private void setName(String name) {
		this.name = name;
	}

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}