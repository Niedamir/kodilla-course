package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
	name = "Employes.retriveEmployeeLastname",
	query = "FROM Employee WHERE lastname = :LASTNAME"
)
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private List<Company> companies = new ArrayList<>();


	public Employee() {
	}

	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	@Column(name = "FIRSTNAME", nullable = false)
	public String getFirstname() {
		return firstname;
	}

	@Column(name = "LASTNAME", nullable = false)
	public String getLastname() {
		return lastname;
	}

	private void setId(int id) {
		this.id = id;
	}

	private void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	private void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name = "JOIN_COMPANY_EMPLOYEE",
		joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
		inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
	)
	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
}