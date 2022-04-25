package entity;

public class Employee 
{
	private int empAge,empId,empSal;
	private String empName;
	
	public Employee(int empId, String empName, int empAge, int empSal) 
	{
		this.empId = empId;
		this.empName=empName;
		this.empAge = empAge;
		this.empSal =empSal;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
}