package com.javaprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = n.nextInt();
		if (num%2 == 0)
			System.out.println(num + " is Even Number");
		else
			System.out.println(num + " is Odd Number");
	}


}
