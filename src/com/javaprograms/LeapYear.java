package com.javaprograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the year :");
		int num = n.nextInt();
		if (num%4 == 0 && num%400 ==0)
			System.out.println(num + " is a Leap Year");
		else
			System.out.println(num + " is not a Leap Year");
	}

}
