package com.javaprograms;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the alphabet to check vowel or consonant");
		char A = in.next().charAt(0);
		if((A=='a' || A=='e' || A=='i' || A=='o' || A=='u' || A=='A' || A=='E' || A=='I' || A=='O' || A=='U')) 
		 
		{
			System.out.println(A + " is a vowel");	
		}
		else
		{
			System.out.println(A + " is a consonant");
		}
			
		
	}

}
