package com.yml.userregistration;
import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to user registration program");
		
		//UC1 first name pattern
		String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		System.out.println("Please enter a first name");
		String firstName = in.nextLine();
		validator(firstNamePattern,firstName,"first name");
		
		//UC2 last name pattern
		String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		System.out.println("Please enter a first name");
		String lastName = in.nextLine();
		validator(lastNamePattern,lastName,"last name");

	}
	
	public static void validator(String pattern, String input,String type) {
		if(Pattern.matches(pattern,input)) {
			System.out.println("Given input '"+input+ "' is a valid "+type);
		}else {
			System.out.println("Given input '"+input+ "' is invalid "+type);
		}
	}
}
