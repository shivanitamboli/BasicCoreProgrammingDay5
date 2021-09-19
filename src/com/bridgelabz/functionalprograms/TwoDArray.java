package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.FunctionalUtility;

public class TwoDArray {
	

	public static void main(String[] args) {
    FunctionalUtility functionalutility=new FunctionalUtility();//object create
    int m=0,n=0,select;
    System.out.println("1.int 2-D Array:");
    System.out.println("2.double 2-D Array:");
    System.out.println("3.boolean 2-D Array:");
    System.out.println("select the type of array from above:");
    //user input
    select=functionalutility.getIntValue();//method calling
    if(select>0 && select<=3)
    {
    	System.out.println("eneter no of coloumns in array:");
    	m=functionalutility.getIntValue();//taking value from user of coloumns
    	System.out.println("eneter no of row in array:");
    	n=functionalutility.getIntValue();//taking value from user of row
    	
    	switch(select)
    	{
    	case 1:
    		Integer [][]array=functionalutility.getIntTwoDArray(m,n);
    	functionalutility.printArray(array,m,n);
    	break;
    	case 2:
    		Double [][]array1=functionalutility.getDoubleTwoDArray(m,n);
    	functionalutility.printArray(array1,m,n);
    	break;
    	
    	case 3:
    		Boolean [][]array2=functionalutility.getBooleanTwoDArray(m,n);
    	functionalutility.printArray(array2,m,n);
    	break;
    	}

    }
    
	}

}
