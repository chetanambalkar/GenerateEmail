package com.Email.Main;

import java.util.Scanner;

import com.Email.Model.Employee;

import com.Email.Service.CredentialService;

public class CredentialApp {
	private static String generatedEmail;

	public static void main(String args[]) {
		char[] generatePassword;
		Employee E1=new Employee("Harshit", "Choudhary");
		CredentialService C1=new CredentialService();
		
		System.out.println("Please enter the department from following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		if(option==1) {
		  generatedEmail=C1.generateEmail(E1.getFirstName(),E1.getLastName(),"tech");
		  generatePassword=CredentialService.generatePassword();
		}else if(option==2) {
		  generatedEmail=C1.generateEmail(E1.getFirstName(),E1.getLastName(),"Admin");
		  generatePassword=CredentialService.generatePassword();
			
		}else if(option==3) {
		  generatedEmail=C1.generateEmail(E1.getFirstName(),E1.getLastName(),"Human Resource");
		  generatePassword=CredentialService.generatePassword();
		}else if (option==4) {
		  generatedEmail=C1.generateEmail(E1.getFirstName(),E1.getLastName(),"Legal");
		  generatePassword=CredentialService.generatePassword();
			
		}else {
			System.out.println("Please enter a valid option");
			sc.close();
			System.exit(-1);
		}
		generatePassword=CredentialService.generatePassword();
		CredentialService.showCredentials(E1.getFirstName(),generatedEmail,generatePassword);
		sc.close();


		


}
}