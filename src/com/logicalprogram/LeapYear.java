package com.logicalprogram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System. in);
		System. out. println("Enter leap year:");
		int year;
	    year = scanner. nextInt();
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
		        System.out.println("LEAP YEAR");  
		    }  
		    else{  
		        System.out.println("NOT LEAP YEAR");  
		    }  
	}

}
