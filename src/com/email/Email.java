package com.email;

import java.util.Scanner;

public class Email {
	private String firstName,lastName,password,department,alternateEmail;
	private int mailBoxCapacity;
	
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created : "+this.firstName+" "+this.lastName);
	}
	private String setDepartment()
	{
		System.out.println("Enter the department\n1 for Sales\n2 for Develeoment\n3 Acoounting\n0 for none");
		Scanner scanner=new Scanner(System.in);
		int value=scanner.nextInt();
		if(value==1)
			return "Sales";
		else if(value==2)
			return "Development";
		else if(value==3)
			return "Accounting";
		else
			return null;
	}
}
