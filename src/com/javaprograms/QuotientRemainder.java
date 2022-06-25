package com.javaprograms;

import java.util.Scanner;

public class QuotientRemainder {
	
 public static void main(String[] args) {
	 int quo,rem;
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the Divisor ");
	 int d = in.nextInt();
	 System.out.println("Enter the Dividend ");
	 int div = in.nextInt();
	 quo=div/d;
	 rem=div%d;
	 System.out.println("Dividend is" + div + " Divisor is" + d + " Quotient is" + quo + " Remainder is" + rem);
	 
 }
}
