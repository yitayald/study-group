package com;

import java.util.Scanner;

public class Exersice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		String grade = in.nextLine();
		
		switch(grade) {
		
		case "A+":
			System.out.println("Highest honors");
			break;
			
		case "A-":
		case "A":
		System.out.println("Honors");
		break;
		
		case "B+":
		case "B":
		System.out.println("Favorable Mention");
		break;
		
		}
		}
		
	}


