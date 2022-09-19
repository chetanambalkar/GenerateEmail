package com.Email.Service;

import java.util.Random;

public class CredentialService {
	
	public static char[] generatePassword() {
		String numbers="0123456789";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacter="!@#$%^&*_+?/";
		
		String values=capitalLetters+smallLetters+specialCharacter;
		Random random=new Random();
		char[] password=new char[8];
		
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
		
	}
    
	public String generateEmail(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".gl.com";
		
	}
	
	public static void showCredentials(String firstName,String generatedEmail, char[] generatePassword) {
		System.out.println("Dear"+ firstName+" your generated credentials are as follow");
	    System.out.println("Email------> "+generatedEmail);
	    System.out.println("Password---> "+generatePassword);

	}
}
