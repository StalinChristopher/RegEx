package com.yml.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration program");
		
		//UC1 first name pattern
		String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		String testCase1FirstName = "Abc";
		String testCase2FirsName = "abc";
		System.out.println(Pattern.matches(firstNamePattern,testCase2FirsName));
		
		
		
	}
}
