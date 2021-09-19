package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalUtility {
	Scanner scanner;

    public FunctionalUtility()
    {
    	 scanner = new Scanner(System.in);
    
    }
	public int getIntValue() 
	{
		return scanner.nextInt();
	}
	public Double getDoubleValue() 
	{
		return scanner.nextDouble();
	}

	public Integer[][] getIntTwoDArray(int m, int n) {
		Integer [][]array=new Integer[m][n];//object creation of wrapper class
		//we can't create object of int data type but we can create it using wrapper class and Integer is wrapper class here 
		System.out.println("Enter:"+(m*n) +"integer value in int array");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		array [i][j]=getIntValue();
        	}
        }
		return array;
		
	}
	public <t> void printArray(t [][] array, int m, int n) {
    //use of t is it takes generic(any type of data) values
		PrintWriter writer = new PrintWriter(System.out);
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = "+array[i][j]); 
				writer.flush();
			}
			
			System.out.println();
		}  
	}
	public Double[][] getDoubleTwoDArray(int m, int n) {
		
		Double [][]array=new Double[m][n];
		System.out.println("Enter:"+(m*n) +"double value in int array");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		array [i][j]=getDoubleValue();
        		
        	}
        }
		return array;
	}
	public Boolean[][] getBooleanTwoDArray(int m, int n) {
		Boolean [][]array=new Boolean[m][n];
		System.out.println("Enter:"+(m*n) +"boolean value in int array");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		array [i][j]=getBooleanValue();
        		
        	}
        }

		return array;
	}
	private Boolean getBooleanValue() {
		return null;
	}
	

	}


