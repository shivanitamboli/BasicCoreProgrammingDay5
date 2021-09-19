package com.logicalprogram;

import java.util.Scanner;

public class FlipCoin {
	Scanner scanner;

    public FlipCoin()
    {
    	 scanner = new Scanner(System.in);
    
    }
	public int getIntValue() 
	{
		return scanner.nextInt();
	}

	
	public static void main(String[] args) {
		
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
    


