package com.email;

import java.util.Scanner;

public class Email {
	private String firstName,lastName,password,department,alternateEmail;
	private int defaultPasswordLength=10;
	private int mailBoxCapacity;
	
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email Created : "+this.firstName+" "+this.lastName);
		
		this.department=setDepartment();
		System.out.println("Department is "+this.department);
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
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
	
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!£$%^&*";
		char password[]=new char[length];
		for(int i=0;i<length;i++)
		{
			int ranndom=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(ranndom);
		}
		return new String(password);
	}
}
