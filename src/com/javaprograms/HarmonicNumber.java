package com.javaprograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		 double i, sum=0;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the last term ");
		 int d = in.nextInt();
		 for(i=1;i<=d;i++) {
			 sum=sum+(1/i);
		 }
		 System.out.println( +d+ "th Harmonic Number is" + sum);
	}

}
