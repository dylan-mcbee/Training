package com.revature.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

	void run() {
		boolean running = true;

		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Welcome to the Bank");
			System.out.println("1. New User\n2. Returning User");
				String selection = in.next();
				if (selection != "1" || selection != "2") {
					System.out.println("Invalid input, please select 1 or 2");
					run();
				}

				switch (selection) {
				case "1":
					System.out.println("First Name:");
					String firstName = in.next();
					System.out.println("Last Name:");
					String lastName = in.next();
					System.out.println("Email:");
					String email = in.next();
					System.out.println("Password:");
					String password = in.next();
					break;
				case "2":
				

			} 
		} while (running);

	}
}
