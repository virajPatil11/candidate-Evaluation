package com.snm.candidateevaluationapplication.model;

public class Employee {

	private int empId;
	private String empName;
	private long empPhone;
	private String empEmail;
	int empGcmLevel;
	private String empDasId;
	private String empPassword;
	private String empRole;
	int empManagerId;
	
	private boolean isLogin;
	
	// ----- Constructor -----

	public Employee() {
//		super();
		// TODO Auto-generated constructor stub
	}

	// ----- Getters & Setters -----
	
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empPhone
	 */
	public long getEmpPhone() {
		return empPhone;
	}

	/**
	 * @param empPhone the empPhone to set
	 */
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the empGcmLevel
	 */
	public int getEmpGcmLevel() {
		return empGcmLevel;
	}

	/**
	 * @param empGcmLevel the empGcmLevel to set
	 */
	public void setEmpGcmLevel(int empGcmLevel) {
		this.empGcmLevel = empGcmLevel;
	}

	/**
	 * @return the empDasId
	 */
	public String getEmpDasId() {
		return empDasId;
	}

	/**
	 * @param empDasId the empDasId to set
	 */
	public void setEmpDasId(String empDasId) {
		this.empDasId = empDasId;
	}

	/**
	 * @return the empPassword
	 */
	public String getEmpPassword() {
		return empPassword;
	}

	/**
	 * @param empPassword the empPassword to set
	 */
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	/**
	 * @return the empRole
	 */
	public String getEmpRole() {
		return empRole;
	}

	/**
	 * @param empRole the empRole to set
	 */
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	/**
	 * @return the empManagerId
	 */
	public int getEmpManagerId() {
		return empManagerId;
	}

	/**
	 * @param empManagerId the empManagerId to set
	 */
	public void setEmpManagerId(int empManagerId) {
		this.empManagerId = empManagerId;
	}

	/**
	 * @return the isLogin
	 */
	public boolean isLogin() {
		return isLogin;
	}

	/**
	 * @param isLogin the isLogin to set
	 */
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	// ----- toString()
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empEmail=" + empEmail
				+ ", empGcmLevel=" + empGcmLevel + ", empDasId=" + empDasId + ", empPassword=" + empPassword
				+ ", empRole=" + empRole + ", empManagerId=" + empManagerId + ", isLogin=" + isLogin + "]";
	}
	
	
	
	
	
	
	
	
}
