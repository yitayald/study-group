package com;

import java.util.Scanner;

public class Exersice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your x value: ");
		int x = input.nextInt();
		int y = input.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
