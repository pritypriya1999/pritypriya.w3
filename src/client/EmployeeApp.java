package client;

import service.EmployeeImpl;

public class EmployeeApp 
{
	public static void main(String args[]) 
	{
		EmployeeImpl obj=new EmployeeImpl();
		obj.createEmployee();
	}
}