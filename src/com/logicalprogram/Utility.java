package com.logicalprogram;

import java.util.Scanner;

class Utility {
	Scanner scanner;

    public Utility()
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



// To check leap year 

public void checkLeapYear(int valueOfYear)
 {
     
 }
public void flipCoinPercent(int numberOfFlips)
{
	double head=0,tail=0,headPercent;
	for(int i=0;i<numberOfFlips;i++)
	{
		double side=Math.random();
		if(side>0.5)
		{
			head++;
		}
		else
		{
			tail++;
		}
		headPercent=head*100/numberOfFlips;
		System.out.println("per of head:"+headPercent);
		System.out.println("per of tail:"+(100-headPercent));

		
	}
}

}
