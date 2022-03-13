package com.eee.mail.service;

import com.eee.mail.model.Employee;

public class CredentialService {

	public String generatePassword() {
		String capitalAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789" ;
		String smallAlpha =  "abcdefghijklmnopqrstuvxyz";
		String special = "@#$%^&*()_+";

		StringBuilder sb = new StringBuilder(8);

		for (int i = 0; i <2 ; i++ ) {

			int index = (int) (capitalAlpha.length() * Math.random());
			sb.append(capitalAlpha.charAt(index));
			index =   (int) (numbers.length() * Math.random());
			sb.append(numbers.charAt(index));
			index =   (int) (smallAlpha.length() * Math.random());
			sb.append(smallAlpha.charAt(index));
			index = (int) (special.length() * Math.random());
			sb.append(special.charAt(index));
			
		}

		return sb.toString();
	}

	private String generateEmailAddress(Employee employee, String department) {

		switch (department) {
		case "1":
			department = "tech";
			break;
		case "2":
			department = "admin";
			break;
		case "3":
			department = "hr";
			break;
		case "4":
			department = "leagal";
			break;
		default:
			department = "";
			break;
		}
		if (department.isEmpty()) {
			return employee.getfName() + employee.getlName() + "@" + "eee.com";
		}

		return employee.getfName() + employee.getlName() + "@" + department + ".eee.com";
	}

	public void showCredentials(Employee employee, String department) {

		System.out.println("Dear " + employee.getfName() + " your generated credentials are as follows");
		System.out.println("Email    --->   " + generateEmailAddress(employee, department));
		System.out.println("Password --->    " + generatePassword());
	}

}
