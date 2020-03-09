package com.email;

import java.util.Scanner;

public class Email {
	private int idno=0;
	private String firstName,lastName,password,department,alternateEmail,email;
	private int defaultPasswordLength=10;
	private int mailBoxCapacity=500;
	private String companySuffix="xyzcompany.com";

	public Email(String firstName,String lastName,String alter)
	{
		idno++;
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Created : "+this.firstName+" "+this.lastName);
		
		
		
		this.department=setDepartment();
		//System.out.println("Department is "+this.department);
		
		
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("Your password is : "+this.password);
		
		email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
		//System.out.println("Your Email is : "+email);
		
		
		setAlternateEmail(alter);
	}
	private String setDepartment()
	{
		System.out.println("Enter the department\n1 for Sales\n2 for Develeoment\n3 Acoounting\n0 for none");
		Scanner scanner=new Scanner(System.in);
		int value=scanner.nextInt();
		if(value==1)
			return "Sales";
		else if(value==2)
			return "Dev";
		else if(value==3)
			return "Acct";
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
	public void setMailBox(int capacity)
	{
		this.mailBoxCapacity=capacity;
	}
	public void setAlternateEmail(String alternate)
	{
		if(alternate=="no")
			this.alternateEmail="none";
		else
		this.alternateEmail=alternate;
	}
	public void changePAssword(String pass)
	{
		this.password=pass;
	}
	public int getMailBox()
	{
		return mailBoxCapacity;
	}
	public String getAlternativeEmail() 
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	public String showInfo()
	{
		return "Name: "+firstName+" "+lastName+"\n"+
				"Department: "+department+"\n"+
				"Company Email: "+email+"\n"+"Password is : "+this.password+"\n"+
				"MailBox : "+mailBoxCapacity+"GB"+"\n"+
				"Alternative Email: "+alternateEmail;
	}
}
