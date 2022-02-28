package com.skillstorm.week5.day1;

import java.util.Objects;

public class Occupation {

	private String jobTitle;
	private Company company;
	private long salary;
	
	public Occupation() {
		
	}
	
	public Occupation(String jobTitle, Company company, long salary) {
		this.jobTitle = jobTitle;
		this.company = company;
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, jobTitle, salary);
	}

	@Override
	public boolean equals(Object obj) {
		// The two objects are exact same place in memory, therefore they MUST have the same data since they're talking 
		// about the same data
		if (this == obj) 
			return true;
		// If the other object is null, then they can't be equal since to even call equals, "this" must not be null
		// Otherwise the code would've thrown a NullPointerException
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Occupation other = (Occupation) obj; // We can safely cast to Occupation data type because of above if check
		// This returns true if all of the fields in the class are equal, if not, return false
		return Objects.equals(company, other.company) && Objects.equals(jobTitle, other.jobTitle)
				&& salary == other.salary;
	}
}
