package com.tidz.code_info.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "programmer")
public class Programmer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "company")
	private String company;
	@Enumerated(value = EnumType.STRING)
	@Column(name = "seniority")
	private Seniority seniority;
	@Column(name = "position")
	private String position;
	@Column(name = "years_of_experience")
	private Integer yearsOfExperience;

	public Programmer() {

	}

	public Programmer(String firstName, String lastName, String company, Seniority seniority, String position,
			Integer yearsOfExperience) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.seniority = seniority;
		this.position = position;
		this.yearsOfExperience = yearsOfExperience;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Seniority getSeniority() {
		return seniority;
	}

	public void setSeniority(Seniority seniority) {
		this.seniority = seniority;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "Programmer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", company=" + company
				+ ", seniority=" + seniority + ", position=" + position + ", yearsOfExperience=" + yearsOfExperience
				+ "]";
	}

}
