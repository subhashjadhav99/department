package com.test.mod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model {
    @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentId;
	private String deparmentName;
	private String departmentCode;
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Model(int departmentId, String deparmentName, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.deparmentName = deparmentName;
		this.departmentCode = departmentCode;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDeparmentName() {
		return deparmentName;
	}

	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
	
}
