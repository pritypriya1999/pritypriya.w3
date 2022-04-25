package service;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import myException.InvalidAgeException;

public class EmployeeImpl 
{
	static Scanner sc=new Scanner(System.in);
	
	static ArrayList<Employee> employeeList=new ArrayList<Employee>();
	
	public void createEmployee()
	{
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println();  

		for(int i=0;i<n;i++)
		{
			try {
				System.out.print("Enter employee id : ");
				int empId=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter employee name : ");
				String empName=sc.nextLine();
				
				System.out.print("Enter employee age : ");
				int empAge=sc.nextInt();
				
				if(empAge < 21)
				{
					throw new InvalidAgeException("Employee should be at least more than 21 years!!\n");
				}
				else {
					System.out.print("Enter employee salary : ");
					int empSal=sc.nextInt(); 
					System.out.println();
					
					Employee e=new Employee(empId, empName, empAge, empSal);
					employeeList.add(e);
				}
			}catch (InvalidAgeException e) {
				System.out.println(e); 
			}
		}
		System.out.println("Displaying employee details: ");
		System.out.println("===================================\n");
		showAllEmployees(employeeList);
		sortAllEmployeesBySalary(employeeList);//calling the method to sort
	}
	public static void showAllEmployees(ArrayList<Employee> employeeList) //displaying employees
	{
		for(Employee emp: employeeList)
		{
			if(emp != null)
			{
				System.out.print("[Employee_Id=" + emp.getEmpId() + ",Employee_Name=" + emp.getEmpName() + ", Employee_Salary=" + emp.getEmpSal() + ", Employee_Age=" + emp.getEmpAge() + "]\n");
			}
		}
	}
	
	public static void sortAllEmployeesBySalary(ArrayList<Employee> employeeList) //sorting employees by salary
	{
		ArrayList<Employee> sortBySalary = (ArrayList<Employee>) employeeList.clone();
		
		for (int i = 0; i < sortBySalary.size(); i++) 
		{
			for (int j = 0; j < sortBySalary.size()-i-1; j++)
			{
				if(sortBySalary.get(j).getEmpSal() > (sortBySalary.get(j+1).getEmpSal())) //ascending order
				{
					Employee temp= sortBySalary.get(j);
					sortBySalary.set(j, sortBySalary.get(j+1));
					sortBySalary.set(j+1, temp);
				}
			}
		}
		System.out.println("\nDisplaying employee details after sorting according to salary in ascending order: ");
		System.out.println("===================================\n");
		showAllEmployees(sortBySalary);
	}
}