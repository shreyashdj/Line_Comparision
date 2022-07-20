package com.bridgelabz.day3LineComparision;

import java.util.Scanner;		// imported Scanner class

public class LineComparision {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparision");
		
		Scanner scan = new Scanner(System.in);		// created scan object
		
		/*
		 * 		taking inputs for x1,y1 & x2,y2
		 */

		System.out.println("\n Enter point A(x1,y1) :");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		System.out.println("Enter point B(x2,y2) :");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		
		double lengthOfLine1 = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));	// calculating length of line
		
		System.out.println("\n Two Points Are A(" +x1 +"," +y1 +") & B(" +x2 +"," +y2 +")");
		System.out.println("Length of the line AB is " + lengthOfLine1);
		
scan.close();
		
	}

}
