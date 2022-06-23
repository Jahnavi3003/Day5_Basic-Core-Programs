package com.javaprograms;

import java.util.Scanner;

public class PowersOfTwo {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = n1.nextInt();
		for (int i=0; i<=N; i++) {
		int p = (int) Math.pow(2, i);	
		System.out.println(" 2^" + i + " is equal to " + p);
		}
	}
}
