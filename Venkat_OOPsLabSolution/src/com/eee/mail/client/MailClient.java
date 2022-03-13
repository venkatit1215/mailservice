package com.eee.mail.client;

import java.util.Scanner;

import com.eee.mail.model.Employee;
import com.eee.mail.service.CredentialService;

public class MailClient {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		CredentialService credentialService = new CredentialService();
		
		System.out.println("Enter First Name ");
		String firstName = scanner.nextLine();
		System.out.println("Enter Last Name ");
		String lastName = scanner.nextLine();
		
		Employee employee = new Employee(firstName, lastName);
		
		System.out.println("Please enter department from the following");
		System.out.println("1. Technical ");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Leagal ");
		
		String department = scanner.nextLine();
		scanner.close();
		credentialService.showCredentials(employee, department);
		
		

	}

}
