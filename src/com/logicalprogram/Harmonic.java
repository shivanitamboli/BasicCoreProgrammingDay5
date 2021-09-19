package com.logicalprogram;

import java.util.Scanner;

public class Harmonic {

	
		Scanner scanner;

	    public Harmonic()
	    {
	    	 scanner = new Scanner(System.in);
	    
	    }
		public int getIntValue() 
		{
			return scanner.nextInt();
		}
	    public void getHarmonicNumber(int number)
	    {
	      double harmonicNumber = 0;
	      for(double i=1;i<=number;i++)
	      {
	    	  harmonicNumber=harmonicNumber+(1/i);
	      }
	  	System.out.println("n'th Harmonic Number of "+ number + ""+ harmonicNumber);
	     }
	}

	

