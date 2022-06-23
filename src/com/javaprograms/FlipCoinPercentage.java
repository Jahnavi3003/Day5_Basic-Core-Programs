package com.javaprograms;

import java.util.Scanner;

public class FlipCoinPercentage {
	public static void main (String[] args) {
		int tails = 0;
		int heads = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("How many coin flips you want: ");
		int num = n.nextInt();
		double rand = (double) Math.floor(Math.random() * 2);
		for (int i=1; i<num; i++) {
				if (rand<0.5)
			tails=tails+1;
		else
			heads=heads+1;
	}
		int tailsp= (tails*100)/num;
		int headsp= (heads*100)/num;
  System.out.println("Percentage of Heads is " + headsp);
  System.out.println("Percentage of Tails is " + tailsp);
  
}
}