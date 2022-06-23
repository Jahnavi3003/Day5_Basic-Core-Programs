package com.javaprograms;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
	Scanner n1 = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a = n1.nextInt();
	Scanner n2 = new Scanner(System.in);
	System.out.println("Enter the value of b: ");
	int b = n2.nextInt();
	a=b-a;
	b=b-a;
	a=a+b;
	
	System.out.println("Swapped value of a is :" + a);
	System.out.println("Swapped value of b is :" + b);

}
}