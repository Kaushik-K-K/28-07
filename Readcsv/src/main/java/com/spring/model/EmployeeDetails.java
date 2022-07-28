package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "EMPLOYEE NAME CANNOT BE NULL")
	@NotEmpty(message = "EMPLOYEE NAME HAS TO BE PRESENT : PLEASE ENTER THE NAME")
	@Pattern(regexp = "^[a-zA-Z]*$", message ="NAME CAN HAVE ONLY ALPHABETIC CHARACTERS")
	private String empName;
	
	@NotNull(message = "EMPLOYEE ID CANNOT BE NULL")
	@NotEmpty(message = "EMPLOYEE ID HAS TO BE PRESENT : PLEASE ENTER THE EMPLOYEE ID")
	@Pattern(regexp = "^[0-9]*$", message = "employee Id can have only number")
	private String empId;
	
	@NotNull(message = "EMPLOYEE DEPARTMENT CANNOT BE NULL")
	@NotEmpty(message = "DEPARTMENT HAS TO BE PRESENT : PLEASE ENTER THE DEPARTMENT")
	private String empDepartment;
	
	@NotNull(message = "EMPLOYEE ADDRESS CANNOT BE NULL")
	@NotEmpty(message = "ADDRESS HAS TO BE PRESENT : PLEASE ENTER THE EMPLOYEE ADDRESS")
	private String empAddress;
	
	@NotNull(message = "EMPLOYEE SALARY CANNOT BE NULL")
	@NotEmpty(message = "SALARY HAS TO BE PRESENT : PLEASE ENTER THE SALARY")
	@Pattern(regexp = "^[0-9]*$",message = "SALARY CAN HAVE ONLY NUMERIC VALUE")
	private String empSalary;
	
	@NotNull(message = "EMAIL ID  CANNOT BE NULL")
	@NotEmpty(message="EMPLOYEE EMAIL HAS TO BE PRESENT : PLEASE ENTER THE EMPLOYEE EMAIL")
	@Email(message = "EMAIL SHOULD BE VALID : PLEASE ENTER THE VALID EMAIL ID")	 
	private String empEmail;
	
	public EmployeeDetails() {
		super();

	}
	
		

	public EmployeeDetails(int id,
			@NotNull(message = "EMPLOYEE NAME CANNOT BE NULL") @NotEmpty(message = "EMPLOYEE NAME HAS TO BE PRESENT : PLEASE ENTER THE NAME") @Pattern(regexp = "^[a-zA-Z]{0,20}$", message = "NAME CAN HAVE ONLY ALPHABETIC CHARACTERS") String empName,
			@NotNull(message = "EMPLOYEE ID CANNOT BE NULL") @NotEmpty(message = "EMPLOYEE ID HAS TO BE PRESENT : PLEASE ENTER THE EMPLOYEE ID") @Pattern(regexp = "^[0-9]{0,1000}$", message = "employee Id can have only number") String empId,
			@NotNull(message = "EMPLOYEE DEPARTMENT CANNOT BE NULL") @NotEmpty(message = "DEPARTMENT HAS TO BE PRESENT : PLEASE ENTER THE DEPARTMENT") String empDepartment,
			@NotNull(message = "EMPLOYEE ADDRESS CANNOT BE NULL") @NotEmpty(message = "ADDRESS HAS TO BE PRESENT : PLEASE ENTER THE EMPLOYEE ADDRESS") String empAddress,
			@NotNull(message = "EMPLOYEE SALARY CANNOT BE NULL") @NotEmpty(message = "SALARY HAS TO BE PRESENT : PLEASE ENTER THE SALARY") @Pattern(regexp = "^[0-9]{0,999999}$", message = "SALARY CAN HAVE ONLY NUMERIC VALUE") String empSalary,
			@NotNull(message = "EMAIL ID  CANNOT BE NULL") @NotEmpty(message = "EMPLOYEE EMAIL HAS TO BE PRESENT : PLEASE ENTER THE EMPLOYEE EMAIL") @Email(message = "EMAIL SHOULD BE VALID : PLEASE ENTER THE VALID EMAIL ID") String empEmail) {
		super();
		this.id = id;
		this.empName = empName;
		this.empId = empId;
		this.empDepartment = empDepartment;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.empEmail = empEmail;
	}



	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", empName=" + empName + ", empId=" + empId + ", empDepartment="
				+ empDepartment + ", empAddress=" + empAddress + ", empSalary=" + empSalary + ", empEmail=" + empEmail + "]";
	}
	
	
	
}
