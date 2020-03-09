package com.email;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter firstName");
		String first=scanner.nextLine();
		System.out.println("Enter lastName");
		String last=scanner.nextLine();
		System.out.println("Any backup email?");
		String mail=scanner.nextLine();
		Email em1=new Email(first,last,mail);
		System.out.println(em1.showInfo());
	}

}
