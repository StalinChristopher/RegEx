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
		System.out.println("Please enter a last name");
		String lastName = in.nextLine();
		validator(lastNamePattern,lastName,"last name");
		
		//UC3 email validation
		String emailPattern = "^[0-9a-zA-Z]+([.+_\\-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
		System.out.println("Please enter your email");
		String email = in.nextLine();
		validator(emailPattern,email,"email");
		
		//UC4 mobile number validation
		String mobilePattern = "[0-9]{2}[\\s][0-9]{10}";
		System.out.println("Please enter the mobile number");
		String mobile = in.nextLine();
		validator(mobilePattern,mobile,"mobile number");
		
		//UC5 password validation
		String passwordPattern = "[0-9a-zA-Z]{8,}";
		System.out.println("Please enter your password");
		String password = in.nextLine();
		validator(passwordPattern,password,"password");
		
	}
	
	public static void validator(String pattern, String input,String type) {
		if(Pattern.matches(pattern,input)) {
			System.out.println("Given input '"+input+ "' is a valid "+type);
		}else {
			System.out.println("Given input '"+input+ "' is invalid "+type);
		}
	}
}
