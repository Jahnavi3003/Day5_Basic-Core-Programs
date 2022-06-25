package com.javaprograms;

import java.util.Scanner;

public class LargestOf3Numbers {
	public static void main(String[] args) {
		int big;
		
	Scanner in = new Scanner(System.in);
	System.out.println("Enter three numbers ");
	int n1 = in.nextInt();
	int n2 = in.nextInt();
	int n3 = in.nextInt();
	if((n1>n2 && n1>n3))
	{
		big=n1;
	}
	else if((n2>n1 && n2>n3))
	{
	    big=n2;
	}
	else
		big=n3;
	
	System.out.println("Largest number among the three numbers is " + big );
	}
}
